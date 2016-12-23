package com.mitarexcomp.IPIterator;

/**
 * Hello world!
 *
 */
public class IPIterator 
{
    public static void main( String[] args )
    {
        System.out.println("Please enter the starting IP adress:");
        String input1 = System.console().readLine();
        System.out.println("Please enter the ending IP adress:");
        String input2 = System.console().readLine();
        // ��� ������� long i ����� ��������� � �������� ��������,
        // ����������� flhtc, �������������� �������� ��� � string
        for (long i = ipToLong(input1) + 1; i < ipToLong(input2); i++)
            System.out.println(longToIp(i));
    }
    
    // ����� ��� �������������� ������ � IP ������� � long
    public static long ipToLong(String ipAddress) {
        long result = 0;
        String[] atoms = ipAddress.split("\\.");

        for (int i = 3; i >= 0; i--) {
            result |= (Long.parseLong(atoms[3 - i]) << (i * 8));
        }

        return result & 0xFFFFFFFF;
    }
	
    // ����� ��� �������������� IP ������ � ������
    public static String longToIp(long ip) {
        StringBuilder sb = new StringBuilder(15);

        for (int i = 0; i < 4; i++) {
            sb.insert(0, Long.toString(ip & 0xff));

            if (i < 3) {
                sb.insert(0, '.');
            }

            ip >>= 8;
        }

        return sb.toString();
    }
}
