package mirror.android.app;


import android.os.IInterface;

import mirror.RefClass;
import mirror.RefStaticObject;
import mirror.RefStaticMethod;

public class ActivityManagerNative {
    public static Class<?> TYPE = RefClass.load(ActivityManagerNative.class, "android.app.ActivityManagerNative");
    public static RefStaticObject<Object> gDefault;
    public static RefStaticMethod<IInterface> getDefault;
}
//遍历class中的Field,Field = constructor(realclass,Field)
//1
//getDefault = new RefStaticMethod(realclass,getDefault); 获取真实系统类中的android.app.ActivityManagerNative.getDefault()，将method保存在类中：getDefault.method
//3