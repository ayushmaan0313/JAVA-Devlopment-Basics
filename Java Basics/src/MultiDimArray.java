class Employ {
    public int EmpID;
    public String name;

    Employ(int EmpID, String name) {
        this.EmpID = EmpID;
        this.name = name;
    }
}

public class MultiDimArray {
    public static void main(String[] args) {

        Employ[] arr;

        arr = new Employ[6];
        /// it throws an exception of not unable to read the feilds and alsio give an exception of null pointer exception when we give array more size than the array size
        arr[0] = new Employ(1, "Ayushmaan Singh");
        arr[1] = new Employ(2, "AArya");
        arr[2] = new Employ(3, "Ndrind");
        arr[3] = new Employ(4, "Abhinav");
        arr[4] = new Employ(5, "Ramesh");
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at " + i + " : { "
                    + arr[i].EmpID + " "
                    + arr[i].name + " }");
    }
}