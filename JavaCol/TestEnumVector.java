import java.util.Enumeration;
import java.util.Vector;
class TestEnumVector
{
public static void main(String args[])
    {
    Vector v  = new Vector();
    for (int i=0;i<10 ;i++)
        {
        v.addElement(i);
        System.out.println(v);

         }
Enumeration e = v.element();
    // Enum func   : hasMoreElements() , nextElements();
    while (e.hasMoreElements())
        {
        // moving cursor to next element
            int i = (Integer)e.nextElement();
            System.out.println(i);
        }

    
    }

}