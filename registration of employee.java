public class employee {
        String name;
        int EmpID;
        int Empsalry;
        void display(){
            System.out.println(name+" "+EmpID+" "+Empsalry);

        }

    }

public class emp2 {
    static void main(String[] args) {

            employee e1 = new employee();
            e1.name="thaffin";
            e1.EmpID=1231;
            e1.Empsalry=20000;
            e1.display();

        }
    }

