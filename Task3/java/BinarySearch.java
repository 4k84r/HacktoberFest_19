public class BinarySearch {
   public static void main(String args[]){
      int array[] = {10, 20, 25, 57, 63, 96};
      int size = array.length;
      int low = 0;
      int high = size-1;
      int value = 25;
      int mid = 0;
      mid = low +(high-low)/2;

      while(low<=high){
         if(array[mid] == value){
            System.out.println(mid);
            break;
         }
         else if(array[mid]<value)
         low = mid+1;
         else high = mid - 1;
      }
      mid = (low+high)/2;
   }
}

The Output:
2
