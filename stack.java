import java.util.Vector;

public class stack implements IStack<String> {

    private Vector<String> info;

    public stack() {
        info = new Vector<String>();
    }


    @Override
    public void push (String item) {
        info.add(item);
    }


    @Override
    public String pop() {
        String temp = "";
        if ( info.size()!=0 ){
            temp = info.remove(info.size()-1);
        }
        return temp;
    }

    
    @Override
    public String peek() {
        return info.get(size()-1);
    }


    @Override
    public boolean empty() {
        return info.size()==0;
    }


    @Override
    public int size() {
        return info.size();
    }
}
