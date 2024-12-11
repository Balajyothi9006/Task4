public class VoterAge {

        private String name;
        private int age;

        // Parameterized Constructor
        public VoterAge(String name, int age ) throws InvalidvoterAgeException
        {

                if(age<18)
                    throw new InvalidvoterAgeException("invalid age for voter");


                this.name=name;
                this.age=age;

            }

           public void displayDetails(){

                System.out.println("voter name:"+this.name);
                System.out.println("voter age:"+this.age);
            }



    public static void main(String[] args) {


        try {
            VoterAge v1 = new VoterAge("Jyothi", 20);
            v1.displayDetails();
        }catch (InvalidvoterAgeException e) {
            System.out.println(e.getMessage());
        }try {
            VoterAge v2 = new VoterAge("Dharani", 15);
            v2.displayDetails();
        }catch (InvalidvoterAgeException e) {
            System.out.println(e.getMessage());
        }try{
            VoterAge v3=new VoterAge("Dharshi",21);
            v3.displayDetails();
        } catch (InvalidvoterAgeException e) {
            System.out.println(e.getMessage());
        }


    }
}
