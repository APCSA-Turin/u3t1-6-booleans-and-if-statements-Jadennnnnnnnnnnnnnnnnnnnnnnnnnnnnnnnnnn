public class SelectionMadness {
    
    public SelectionMadness() { }
  
    public String fortune() {
        int num = (int) (Math.random() * 5);
        if (num == 0) {
            return "You will be hungry again in one hour.";
        } else if (num == 1) {
            return"The greatest risk is not taking one.";
        } else if (num == 2) {
            return "Let the deeds speak.";
        } else if (num == 3) {
            return "You learn from your mistakes... You will learn a lot today.";
        } else return "Adversity is the parent of virtue.";
    }
  
    public int largest(int num1, int num2, int num3) {
       return Math.max(Math.max(num2, num3), num1);
    }

    public boolean rightTriangle(int side1, int side2, int side3) {
        int largest = largest(side1, side2, side3);

        if (largest == side1) {
            if (Math.pow(side1, 2) == Math.pow(side2, 2) + Math.pow(side3, 2)) {
                return true;
            }
        } else if (largest == side2) {
            if (Math.pow(side2, 2) == Math.pow(side1, 2) + Math.pow(side3, 2)) {
                return true;
            }
        } else {
            if (Math.pow(side3, 2) == Math.pow(side1, 2) + Math.pow(side2, 2)) {
                return true;
        }
        }
        return false;
  }
}