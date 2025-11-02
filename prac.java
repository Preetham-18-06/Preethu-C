 

   

public class prac {
    public static void main(String[] args) {
            int n[][]=new int[3][];
            
             n[0]=new int[3];
             n[1]=new int[4];
             n[2]=new int[2];

            for(int i=0;i<n.length;i++)
            {
                for(int j=0;j<n[i].length;j++)
                {
                    n[i][j]=(int)(Math.random()*10); //jagged array
                    System.out.print(n[i][j]+ "  ");
                }
                System.out.println();
            }

            System.out.println();


            for(int i=0;i<n.length;i++)
            {
                for(int j=0;j<n[i].length;j++)
                {
                    System.out.print(n[i][j]+ "  ");
                }
                System.out.println();
            }
            

            }
        }
        
    

