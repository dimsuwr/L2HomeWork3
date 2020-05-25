import java.util.TreeMap;


public class Main {
    public static void main(String[] args) {



                String[] world = new String[10];
                world[0] = "Набор_1";
                world[1] = "Набор_1";
                world[2] = "Набор_1";
                world[3] = "12345";
                world[4] = "Набор_2";
                world[5] = "Набор_3";
                world[6] = "Набор_4";
                world[7] = "12";
                world[8] = "Набор_3";
                world[9] = "Финал";

               uniqueMethod(world);

                guide();
            }

            public static void uniqueMethod(String[] world){


                TreeMap<String, Integer> treeMap = new TreeMap<>();

                for (int i = 0; i< world.length; i++){
                    if (treeMap.containsKey(world[i])){
                        treeMap.put(world[i], treeMap.get(world[i])+1);
                    }else{
                        treeMap.put(world[i], 1);
                    }
                }

                System.out.println(treeMap);
            }

            public static void guide(){


                PhoneList phoneList = new PhoneList();
                /*
                *
                * Имена сделаны для простоты усваивания информации, в задании фамилии, условился что это такие фамилии.
                * =)
                 */

                phoneList.add("Дмитрий", "79150000001");
                phoneList.add("Екатерина", "79150000002");
                phoneList.add("Юлия", "79150000003");
                phoneList.add("Ирина", "79150000004");
                phoneList.add("Владимир", "79150000005");
                phoneList.add("Юлия", "79150000006");
                phoneList.add("Дмитрий", "79150000007");
                phoneList.add("Дмитрий", "79150000008");

                System.out.println(phoneList.get("Дмитрий"));
                System.out.println(phoneList.get("Алексей"));
                System.out.println(phoneList.get("Екатерина"));
                System.out.println(phoneList.get("Юлия"));
                System.out.println(phoneList.get("Олег"));
                System.out.println(phoneList.get("Владимир"));
                System.out.println(phoneList.get("Ирина"));
    }
}
