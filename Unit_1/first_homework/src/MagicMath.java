public class MagicMath {

    static int fact(int n){
        int p = n;
        if (n >= 0){
            for (int i = 1; i < p; ++i)
                n *= i;
            return n;
        }
        else{
            System.out.println("��������� �������������� ����� �� ����� ���� ��������!");
            System.exit(0);
            return - 1;
        }
    };

    static int abs(int n){
        if (n >= 0)
            return n;
        else
            return n *= -1;
    };

    static int pow(int n, int e){
        int p = n;
        if (n >= 0 && e >= 0) {
            if (e == 0) {
                return 1;
            } else {
                for (int i = 1; i < e; ++i)
                    p *=n;
                return p;
            }
        }
        else{
            System.out.println("�������� ���������!");
            System.exit(0);
            return - 1;
        }
    };
}