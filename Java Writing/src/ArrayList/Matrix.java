package ArrayList;
import java.util.ArrayList;
import java.util.List;

public class Matrix {
    private List<List<Integer>> m;
    private int row,col;
    public Matrix (int r, int c){
        row = r;
        col= c;
        m = new ArrayList<List<Integer>>(r);
        for (int i=0; i<r;++i){
            m.add(new ArrayList<Integer>(c));
        }
    }
    public Integer getVal(int row, int col){
        return m.get(row).get(col);
    }
    public void setVal(int row, int col, int val){
        m.get(row).set(col,val);
    }
    public Integer getMaxVal(){
        Integer biggy = new Integer(getVal(0,0));
        for(int i=0;i<row;++i){
            for(int j=0; j<col;++j){
                if (biggy < getVal(i,j)){
                    biggy=getVal(i,j);
                }
            }
        }
        return biggy;

    }

    public String toString(){
        String s = "[\n";
        for (int i=0; i<row; ++i ){
            for(int j=0; j<col ; ++j){
                s+=getVal(i,j).toString();
                if(j == col-1){
                    s+="\n";
                }
                else{
                    s+="    ";
                }
            }
        }
        s+="]\n";
        return s;
    }

    public static void main(String[] args){
        Matrix m = new Matrix(4,4);
        m.init(); //TODO: add init() method to initialize the matrix with random values
        System.out.println(m);
        System.out.println("Max value in matrix is: "+m.getMaxVal());
    }


}

