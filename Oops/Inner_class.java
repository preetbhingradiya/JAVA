class One {
    public int num = 10;

    void disply() {
        System.out.println("One Class Number : " + num);
    }

    class Two {
        int num = 20;

        public void add() {
            System.out.println("One And Two Class Sum : " + (num + One.this.num));
        }
    }

    static class Three {
        int num1 = 30;
        One OuterNumber;

        public Three(One outer) {
            this.OuterNumber = outer;
        }

        public void add() {
            System.out.println("One And Three Class Sum : " + (num1 + OuterNumber.num));
        }
    }
}

public class Inner_class {
    public static void main(String[] args) {
        
        One obj = new One(){
            void disply() {  //method ovverriding use of anonymous inner class
                System.out.println("Inner Class Number : " + num);
            }
        };
        obj.disply();

        One.Two obj1 = obj.new Two();
        obj1.add();

        One.Three obj2 = new One.Three(obj); // if use of static class
        obj2.add();
    }
}
