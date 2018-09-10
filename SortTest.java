
public class SortTest {
	
	public static <AnyType extends Comparable<? super AnyType>> void insertionSort(AnyType []a) {
	int j;
	for(int i=1;i<a.length;i++) {
		AnyType tmp=a[i];
		for(j=i;j>0&&tmp.compareTo(a[j-1])<0;j--) {
			a[j]=a[j-1];			
		}
		a[j]=tmp;
	}	
	}

	public static <AnyType extends Comparable<? super AnyType>> void shellSort(AnyType []a) {
		int j;
		for(int gap=a.length/2;gap>0;gap/=2)
		for(int i=gap;i<a.length;i++){
			AnyType tmp=a[i];
			for(j=i;j>=gap&&tmp.compareTo(a[j-gap])<0;j-=gap) {
				a[j]=a[j-gap];
			}
			a[j]=tmp;
		}		
	}
	
	public static <AnyType extends Comparable<? super AnyType>> void mergeSort(AnyType []a) {
		AnyType[] tmpa=(AnyType[])new Comparable[a.length];
		mergeSort(a,tmpa,0,a.length-1);
	}
	
	private static <AnyType extends Comparable<? super AnyType>> void mergeSort(AnyType[] a, AnyType[] tmpa, int left, int right) {
		if(left<right) {
			int center=(left+right)>>1;
			mergeSort(a,tmpa,left,center);
			mergeSort(a,tmpa,center+1,right);
			merge(a,tmpa,left,center+1,right);
		}
		
	}

	private static <AnyType extends Comparable<? super AnyType>> void merge(AnyType[] a, AnyType[] tmpa, int leftPos, int rightPos, int rightEnd) {
		int leftEnd=rightPos-1;
		int t=leftPos;
		int length=rightEnd-leftPos+1;
		while(leftPos<=leftEnd&&rightPos<=rightEnd) {
			if(a[leftPos].compareTo(a[rightPos])<0) {
				tmpa[t++]=a[leftPos++];				
			}
			else {
				tmpa[t++]=a[rightPos++];
			}
		}
		if(leftPos>leftEnd) {
			while(rightPos<=rightEnd) tmpa[t++]=a[rightPos++];
		}
		if(rightPos>rightEnd) {
			while(leftPos<=leftEnd) tmpa[t++]=a[leftPos++];
		}
		for(int i=1;i<=length;i++,rightEnd--) {
			a[rightEnd]=tmpa[rightEnd];
		}
	}
	
	public static <AnyType extends Comparable<? super AnyType>> void quickSort(AnyType []a) {
		quickSort(a,0,a.length-1);
	}
	
	private static <AnyType extends Comparable<? super AnyType>> void quickSort(AnyType[] a, int left, int right) {
		if(left>=right) return;
		int mid=partSort(a,left,right);
		quickSort(a,left,mid-1);
		quickSort(a,mid+1,right);		
		
	}

	private static <AnyType extends Comparable<? super AnyType>> int partSort(AnyType[] a, int left, int right) {
		int mid=getMid(a,left,right);
		AnyType tmp=a[mid];
		swap(a,mid,right);
		mid=right;
		left--;
		while(true) {
		while(a[++left].compareTo(tmp)<=0&&left<right);
		while(a[--right].compareTo(tmp)>=0&&left<right);
		if(left>=right)break;
		swap(a,left,right);
		}
		swap(a,left,mid);
		return left;
	}

	
	private static <AnyType extends Comparable<? super AnyType>> void swap(AnyType[] a, int i, int j) {
		AnyType tmp=a[i];
		a[i]=a[j];
		a[j]=tmp;
	}

	private static <AnyType extends Comparable<? super AnyType>> int getMid(AnyType[] a, int left, int right) {	
		int mid=left+(right-left)>>1;
			if(a[left].compareTo(a[right])<=0)
		    {
		        if(a[mid].compareTo(a[left])<0)
		            return left;
		        else if(a[mid].compareTo(a[right])>0)
		            return right;
		        else
		            return mid;
		    }
		    else
		    {
		        if(a[mid].compareTo(a[right])<0)
		            return right;
		        else if(a[mid].compareTo(a[left])>0)
		            return left;
		        else
		            return mid;
		    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer num[]= {81,94,11,96,12,75,35,17,95,28,58,41,75,15};
		//insertionSort(num);
		//shellSort(num);
		//mergeSort(num);
		quickSort(num);
		for(int n:num) {
		System.out.print(n+"\t");
		}
	}

}
