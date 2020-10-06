/*
문자열 분석

문제
문자열 N개가 주어진다. 이때, 문자열에 포함되어 있는 소문자, 대문자, 숫자, 공백의 개수를 구하는 프로그램을 작성하시오.

각 문자열은 알파벳 소문자, 대문자, 숫자, 공백으로만 이루어져 있다.

입력
첫째 줄부터 N번째 줄까지 문자열이 주어진다. (1 ≤ N ≤ 100) 문자열의 길이는 100을 넘지 않는다.

출력
첫째 줄부터 N번째 줄까지 각각의 문자열에 대해서 소문자, 대문자, 숫자, 공백의 개수를 공백으로 구분해 출력한다.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by WOOSERK.
 * User: WOOSERK
 * Date: 2020-10-06
 * Time: 오후 4:39
 */

public class Q10820
{
    public static void main(String[] args)
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try
        {
            while(true)
            {
                int[] ary = new int[4];

                String str = br.readLine();

                char[] cAry = str.toCharArray();
                int cLen = cAry.length;

                for(int i=0; i<cLen; i++)
                {
                    char ch = cAry[i];

                    if(ch == ' ')
                        ++ary[3];
                    else if(ch >= '0' && ch <= '9')
                        ++ary[2];
                    else if(ch >= 'A' && ch <= 'Z')
                        ++ary[1];
                    else
                        ++ary[0];
                }

                StringBuilder sb = new StringBuilder();

                sb.append(ary[0]).append(" " + ary[1]).append(" " + ary[2]).append(" " + ary[3]);

                System.out.println(sb.toString());
            }
        }
        catch(Exception e) {}
    }
}
