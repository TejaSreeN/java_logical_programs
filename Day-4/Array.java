 class Array
 {
    public static void main(String[] args)
 {
          int[] originalArray = {1, 2, 3, 4, 5};
         int[] copiedArray = new int[originalArray.length];
         System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);
         System.out.print("Copied Array: ");
        for (int element : copiedArray)
  {
            System.out.print(element + " ");
        }
    }
}

