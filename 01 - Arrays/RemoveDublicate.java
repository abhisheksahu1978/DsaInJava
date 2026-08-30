public class RemoveDublicate {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        // Maximum possible unique elements = arr.length
        int[] unique = new int[arr.length];

        int uniqueCount = 0;

        // Har element ko check karenge
        for (int i = 0; i < arr.length; i++) {

            boolean isDuplicate = false;

            // Check karo ki element pehle se unique array mein hai ya nahi
            for (int j = 0; j < uniqueCount; j++) {

                if (arr[i] == unique[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // Agar duplicate nahi hai, to unique array mein add karo
            if (!isDuplicate) {
                unique[uniqueCount] = arr[i];
                uniqueCount++;
            }
        }

        // Unique elements print karo
        System.out.print("Array after removing duplicates: ");

        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(unique[i] + " ");
        }
    }
}