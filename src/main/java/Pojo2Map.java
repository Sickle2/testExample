//
//import java.lang.reflect.Field;
//import java.lang.reflect.Method;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
///**
// * @author zhaoshuai@ucfgroup.com
// * @Title: cn.ucfgroup.eten.fore.utils
// * @Description:
// * @Company: ucfgroup.com
// * @Created on 2018/3/22 17:52
// * @Copyright: Copyright (c) 2018/3/22
// */
//public class Pojo2Map {
//    /**
//     * 概要 根据静态属性名获取属性值
//     *
//     * @param o PoJo实体
//     * @return Object 属性值 （空值返回“empty”字符串）
//     */
//    public static Object getStaticFieldValueByName(String fieldName, Object o) {
//        try {
//            Field field = o.getClass().getDeclaredField(fieldName);
//            return field.get(o);
//        } catch (Exception e) {
//            return "empty";
//        }
//    }
//
//    /**
//     * 概要 根据非静态属性名获取属性值
//     *
//     * @param o PoJo实体
//     * @return Object 属性值 （空值返回“empty”字符串）
//     */
//    public static Object getFieldValueByName(String fieldName, Object o) {
//        try {
//            String firstLetter = fieldName.substring(0, 1).toUpperCase();
//            String getter = "get" + firstLetter + fieldName.substring(1);
//            Method method = o.getClass().getMethod(getter, new Class[] {});
//            Object value = method.invoke(o, new Object[] {});
//            return value;
//        } catch (Exception e) {
//            return null;
//        }
//    }
//
//    /**
//     * 概要 根据属性名设定属性值
//     *
//     * @param o PoJo实体
//     * @return void
//     */
//    public static void setFieldValueByName(String fieldName, Object o,Object value) {
//        try {
//            String firstLetter = fieldName.substring(0, 1).toUpperCase();
//            String setter = "set" + firstLetter + fieldName.substring(1);
//
//            String class_name = value.getClass().getName();
//            Method method = o.getClass().getDeclaredMethod(setter, o.getClass().getDeclaredField(fieldName).getType());
//            method.invoke(o, new Object[] {value});
//        } catch (Exception e) {
//        }
//    }
//
//    /**
//     * 概要 获取属性名数组
//     *
//     * @param o PoJo实体
//     * @return 属性名数组
//     */
//    public static String[] getFiledName(Object o){
//        Field[] fields=o.getClass().getDeclaredFields();
//        String[] fieldNames=new String[fields.length];
//        for(int i=0;i<fields.length;i++){
//            fieldNames[i]=fields[i].getName();
//        }
//        return fieldNames;
//    }
//
//    /**
//     * 概要 获取属性类型(type)，属性名(name)，属性值(value)的map组成的list
//     *
//     * @param o PoJo实体
//     * @return List<Map> 列表<属性类型(type),属性名(name),属性值(value)>
//     */
//    public static List<Map<String,String>> getFiledsInfo(Object o){
//
//        Field[] fields=o.getClass().getDeclaredFields();
//        String[] fieldNames=new String[fields.length];
//        List list = new ArrayList();
//        Map infoMap=null;
//        for(int i=0;i<fields.length;i++){
//            infoMap = new HashMap();
//            infoMap.put("type", fields[i].getType().toString());
//            infoMap.put("name", fields[i].getName());
//            if(getFieldValueByName(fields[i].getName(), o)==null){
//                infoMap.put("value", "empty");
//            }else{
//                infoMap.put("value", getFieldValueByName(fields[i].getName(), o));
//            }
//            list.add(infoMap);
//        }
//        return list;
//    }
//
//    /**
//     * 概要 获取对象的所有属性值，返回一个对象数组
//     *
//     * @param o PoJo实体
//     * @return 对象的所有属性值
//     */
//    public Object[] getFiledValues(Object o){
//        String[] fieldNames=this.getFiledName(o);
//        Object[] value=new Object[fieldNames.length];
//        for(int i=0;i<fieldNames.length;i++){
//            value[i]=this.getFieldValueByName(fieldNames[i], o);
//        }
//        return value;
//    }
//
//    /**
//     * 概要 将PoJo转换成DBObject
//     *
//     * @param o PoJo实体
//     * @return DBObject
//     */
//    public static JSONObject toJSONObject(Object o) {
//        try {
//            JSONObject result = new JSONObject();
//            String[] fields = getFiledName(o);
//            for (String item : fields) {
//
//                Object val = getFieldValueByName(item,o);
//                if(val!=null){
//                    result.put(item, val);
//                }
//            }
//            return result;
//        } catch (Exception e) {
//            return null;
//        }
//    }
//
//    /**
//     * 概要 将PoJo转换成DBObject
//     *
//     * @param o PoJo实体
//     * @return DBObject
//     */
//    public static Map<Object,Object> toMap(Object o) {
//        Map<Object,Object> retMap = new HashMap();
//        try {
//            List<Map<String,String>> keys = getFiledsInfo(o);
////            for (Map<String,String> map : keys) {
////                String fieldName =  (String)map.get("name");
////                String fieldValue = (String)map.get("value");
////                retMap.put(fieldName,fieldValue);
////            }
//            for (int i = 0;i < keys.size();i++){
//                Object fieldName =  keys.get(i).get("name");
//                Object fieldValue = keys.get(i).get("value");
//                retMap.put(fieldName,fieldValue);
//            }
//            return retMap;
//        } catch (Exception e) {
//            return null;
//        }
//    }
//
//    /**
//     * 概要 将PoJo转换成DBObject
//     *
//     * @param o PoJo实体
//     * @return DBObject
//     */
//    public static List<Map<Object,Object>> toListMap(List<ActBankRun> o) {
//        List<Map<Object,Object>> retList = new ArrayList<Map<Object,Object>>();
//        try {
//            for (Object o1 : o) {
//                Map<Object,Object> itemMap = toMap(o1);
//                retList.add(itemMap);
//            }
//            return retList;
//        } catch (Exception e) {
//            return null;
//        }
//    }
//
//    public static void main(String[] args){
//        ActBankRun actBankRun=new ActBankRun();
//        actBankRun.setUserId("111111");
//        System.out.println(Pojo2Map.getFiledsInfo(actBankRun));
//        System.out.println("----------------------");
//        System.out.println(Pojo2Map.getFieldValueByName("userId",actBankRun));
////
////        CpsCouponConfigView cpsCouponConfigView = new CpsCouponConfigView();
////        cpsCouponConfigView.setCreateTime(new Date());
////
////        System.out.println(PoJoUtil.toJSONObject(cpsCouponConfigView));
//    }
//}
