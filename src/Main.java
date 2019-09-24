public class Main {

    public static void main(String[] args)  {

IMyList<Integer> myIntegerList = new MyIntegerListImpl();
IMyList<String> myStringList = new MyStringListImpl();

myIntegerList.add(7);
myStringList.add("for");

print(myIntegerList);
print(myStringList);

    }
    public static void print(IMyList iMyList) {
   iMyList.print();

    }
}
