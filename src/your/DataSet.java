package your;

import java.util.ArrayList;

public class DataSet {

    private ArrayList<Integer> data = new ArrayList<Integer>();


    public DataSet() {
        //sets data size to 30 by default
        generateData(30);

    }


    public void generateData(int value) {

        //try catch needed
        if(value > 50){
           System.out.println("Array size to big");
           return;
        }
        for (int i = 0; i < value; i++) {
            //currently generates random numbers to 10
            int randomNum = (int) (Math.random() * 50);
            data.add(randomNum);

        }

    }


    public Integer getarraySize(){
        return data.size();

    }

    public ArrayList<Integer> getArray(){
        return this.data;

    }





//    public static void main(String[] args) {
//    DataSet test = new DataSet();
//
//    test.generateData(20);
//
//    System.out.println(test.data);
//
//    }


}




