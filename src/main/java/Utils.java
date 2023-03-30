
public class Utils {
    /*
1поиск сотрудника в массиве по его имени
2поиск сотрудника в массиве по вхождению указанной строки в его имени
3подсчет зарплатного бюджета для всех сотрудников в массиве
4поиск наименьшей зарплаты в массиве
5поиск наибольшей зарплаты в массиве
6поиск наименьшего количества подчиненных в массиве менеджеров
7поиск наибольшего количества подчиненных в массиве менеджеров
8поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
9поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
*/
    //поиск сотрудника в массиве по его имени
    static Employee searchByName(Employee[] emp, String name){
        for (int i=0; i<emp.length; i++){
            if(emp[i].getName().equals(name)){
                //System.out.println(emp[i].getName());
                return emp[i];
            }
        }
        return null;
    }

    //поиск сотрудника в массиве по вхождению указанной строки в его имени
    static Employee searchBySubName(Employee[] emp, String subName){
        for (int i=0; i<emp.length; i++){
            if(emp[i].getName().contains(subName)){
                //System.out.println(emp[i].getName());
                return emp[i];
            }
        }
        return null;
    }

    //подсчет зарплатного бюджета для всех сотрудников в массиве
    static double getSalaryBudget(Employee[] emp){
        double budget=0;
        for (int i=0; i<emp.length; i++){
            budget+= emp[i].getBaseSalary();
        }
        return budget;
    }

    //поиск наименьшей зарплаты в массиве
    static double getMinSalary(Employee[] emp){
        double minSalary=Integer.MAX_VALUE;
        for (int i=0; i<emp.length; i++){
            if(minSalary> emp[i].getBaseSalary()){
                minSalary=emp[i].getBaseSalary();
            }
        }
        return minSalary;
    }

    //поиск наибольшей зарплаты в массиве
    static double getMaxSalary(Employee[] emp){
        double maxSalary=0;
        for (int i=0; i<emp.length; i++){
            if(maxSalary< emp[i].getBaseSalary()){
                maxSalary=emp[i].getBaseSalary();
            }
        }
        return maxSalary;
    }

    //поиск наименьшего количества подчиненных в массиве менеджеров
    static int getMinNumOfSubordinates(Manager[] manag){
        int minNumOfSubordinates=Integer.MAX_VALUE;
        for (int i=0; i<manag.length; i++){
            if(minNumOfSubordinates>manag[i].getNumberOfSubordinates()){
                minNumOfSubordinates=manag[i].getNumberOfSubordinates();
            }
        }
        return minNumOfSubordinates;
    }

    //поиск наибольшего количества подчиненных в массиве менеджеров
    static int getMaxNumOfSubordinates(Manager[] manag){
        int maxNumOfSubordinates=Integer.MIN_VALUE;
        for (int i=0; i<manag.length; i++){
            if(maxNumOfSubordinates<manag[i].getNumberOfSubordinates()){
                maxNumOfSubordinates=manag[i].getNumberOfSubordinates();
            }
        }
        return maxNumOfSubordinates;
    }

    //поиск наибольшей надбавки (разнице между базовой зарплатой
    //и выплатой) в массиве менеджеров
    static double getMaxSalaryDifference(Manager[] manag){
        double maxSalaryDifference=Integer.MIN_VALUE;
        double salaryDifference=0;

        for (int i=0; i<manag.length; i++){
            salaryDifference=manag[i].getSalaryManager()-manag[i].getBaseSalary();
            if(maxSalaryDifference<salaryDifference){
                maxSalaryDifference=salaryDifference;
            }
        }
        return maxSalaryDifference;
    }

    //поиск наименьшей надбавки (разнице между базовой ставки
    //и зарплатой) в массиве менеджеров
    static double getMinSalaryDifference(Manager[] manag){
        double minSalaryDifference=Integer.MAX_VALUE;
        double salaryDifference=0;

        for (int i=0; i<manag.length; i++){
            salaryDifference=manag[i].getSalaryManager()-manag[i].getBaseSalary();
            if(minSalaryDifference>salaryDifference){
                minSalaryDifference=salaryDifference;
            }
        }
        return minSalaryDifference;
    }
}
