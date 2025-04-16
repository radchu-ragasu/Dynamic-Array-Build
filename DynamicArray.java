import java.util.Scanner;
import java.util.Arrays;

class Array{
    private int size;
    private int capacity;
    static private final int initialCapacity = 16;
    private int arr[];

    Array()
    {
        size = 0;
        arr = new int[initialCapacity];
        capacity = initialCapacity;
    }

    public void addEnd(int value)
    {
        if (size == capacity)
        {
            expandArray();
        }
        arr[size++] = value;
    }

    public void display()
    {
        System.out.println(Arrays.toString(arr));
    }

    public void posAdd(int pos ,int value)
    {

    }

    public void expandArray()
    {

    }
}

public class DynamicArray{
    public static void main(String []args)
    {
        Array list = new Array();
        Scanner scan = new Scanner(System.in);
        int choice,value, pos;

    while (true)
    {
        System.out.println("*****--List Menu--*****");
        System.out.println("1.Insert at End");
        System.out.println("2.Display the list");
        System.out.println("3.Insert at  Specified Position");
        System.out.println("4.Delete from specified Position");
        System.out.println("5.Exit from the loop");
        System.out.println("************************************");
        System.out.println("Enter your choice: ");
        choice=scan.nextInt();

        switch(choice)
        {
            case 1:
                System.out.println("Enter the value: ");
                value=scan.nextInt();
                list.addEnd(value);
                break;
            case 2:
                list.display();
                break;
            case 3:
                System.out.println("Enter the specified Position (Position Starts at 0):");
                pos = scan.nextInt();
                if (pos<0)
                {
                    System.out.println("Invalid Position insert the correct position");
                }
                System.out.println("Enter the Value: ");
                value =scan.nextInt();
                list.posAdd(pos,value);
            case 4:
                System.out.println();
                break;
            case 5:
                System.out.println("The menu is ending");
                scan.close();
                return;
            default:
                System.out.println("Please enter the correct valid number :");
                break;

        }

    }
    
    }
}