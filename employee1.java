class employee{
    String name;
    int year_of_joining;
    String Salary;
    String address;

    employee(String name , int year_of_joining ,String Salary , String address ){
        this.name = name;
        this.year_of_joining = year_of_joining;
        this.Salary = Salary;
        this.address = address;
    }
}

class employee1{
    public static void main(String[] args) {
        employee obj1 = new employee("Robert", 1994 ,"64C" ,"wallstreet");
        employee obj2 = new employee("Sam", 2000 ,"68D" ,"wallstreet");
        employee obj3 = new employee("John", 1999 ,"26B", "wallstreet");

        System.out.println(obj1.name +" "+ obj1.year_of_joining+" " +obj1.Salary +" "+obj1.address);
        System.out.println(obj2.name +" "+ obj2.year_of_joining +" "+obj2.Salary +" "+obj2.address);
        System.out.println(obj3.name + " "+obj3.year_of_joining+" "+obj3.Salary +" " +obj3.address);
    }
}