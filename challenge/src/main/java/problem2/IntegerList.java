package problem2;

public class IntegerList
{
    int[] list; //values in the list
    int numberOfElements;
    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;
            numberOfElements = list.length;
    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<numberOfElements; i++)
            System.out.println(i + ":\t" + list[i]);
    }
    //-------------------------------------------------------
    // Double the list size
    //-------------------------------------------------------
    public void increaseSize(){
        int[] newlist = new int[list.length * 2];
        for (int i = 0; i < list.length; i++){
            newlist[i] = list[i];
        }
        list = newlist;
    }
    //-------------------------------------------------------
    // Add new element to list
    //-------------------------------------------------------
    public void addElement(int newVal){
        if (numberOfElements == list.length){
            increaseSize();
        }
        numberOfElements++;
        list[numberOfElements - 1] = newVal;
    }
    //-------------------------------------------------------
    // Remove first occurrence of an chosen number
    //-------------------------------------------------------
    public void removeFirst(int oldVal){
        for (int i = 0; i < numberOfElements; i++){
            if (list[i] == oldVal){
                for (int j = i; j < numberOfElements-1; j++){
                    list[j] = list[j+1];
                }
                list[numberOfElements-1] = 0;
                numberOfElements--;
                break;
            }
        }
    }
    //-------------------------------------------------------
    // Remove all occurrences of a given number
    //-------------------------------------------------------
    public void removeAll(int oldVal){
        int i = 0;
        while (i < numberOfElements){
            if(list[i] == oldVal){
                for(int j = i; j < numberOfElements-1; j++ ){
                    list[j] = list[j+1];
                }
                list[numberOfElements-1] = 0;
                numberOfElements--;
            }
            else{
                i++;
            }
        }
    }

}