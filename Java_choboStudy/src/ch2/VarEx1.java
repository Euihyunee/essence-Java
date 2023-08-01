package ch2;

class VarEx1 {
    public static void main(String[] args) {
        int year = 0;
        int age = 14;

        // 변수 age의 값에 2000을 더해서 변수 year 저장
        System.out.println(year);
        // 변수 age에 저장된 값을 1증가시킨다.
        System.out.println(age);


        // TODO 대입연산(=)은 우변의 모든 계산이 끝난 후에 제일 마지막에 수행됨
        year = age + 2000;
        age++;

        System.out.println(year);
        System.out.println(age);
    }
}
