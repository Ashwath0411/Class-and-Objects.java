class encapsulation2 {
    private int regno;
    private String name;
    public void  setSalary(int regno,String name){
        this.regno=regno;
        this.name=name;
    }
    public int getRegno(){
        return regno;

    }public String getName(){
        return name;
    }


    static void main(String[] args) {
        encapsulation2 e1=new encapsulation2();
        e1.setSalary(23036,"thaffin");
        System.out.println(e1.getRegno());
        System.out.println(e1.getName());
    }
}
