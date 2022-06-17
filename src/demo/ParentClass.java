package demo;

public abstract class ParentClass {

    public void printInfor(){
        System.out.println(this.hashCode());
    }

    public abstract void specific();
}
