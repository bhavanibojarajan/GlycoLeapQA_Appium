package FindUnits;

import jdk.internal.util.xml.impl.Input;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindUnits {

    public static String WeightUnit(String Input)
    {
        String KG="kg";
        String LBS="lbs";

        if(isContain(Input.toLowerCase(),KG))
        {
            return KG;
        }
        else
        {
            return LBS;
        }
    }

    public static String HeightUnit(String Input)
    {
        String CM="cm";
        String FT="ft";

        if(isContain(Input.toLowerCase(),CM))
        {
            return CM;
        }
        else
        {
            return FT;
        }
    }


    private static boolean isContain(String source, String subItem){
        String pattern = subItem;
        Pattern p=Pattern.compile(pattern);
        Matcher m=p.matcher(source);
        return m.find();
    }

}
