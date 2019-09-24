public class Main {

    public static void main(String[] args)  {

MyIntegerListImpl myIntegerList = new MyIntegerListImpl();
MyStringListImpl myStringList = new MyStringListImpl();

myIntegerList.add(7);
myStringList.add("for");

print(myIntegerList,myStringList);

    }
    public static void print(IMyList iMyList,IMyList iMyList1) {
   iMyList.print();
   iMyList1.print();
    }
}
