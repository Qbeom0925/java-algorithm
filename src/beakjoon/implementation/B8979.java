package beakjoon.implementation;

import java.util.*;
import java.io.*;

public class B8979 {
	

	static class Country implements Comparable<Country>{
	    int num,gold,silver,bronze;
	    
	    Country(int num, int gold, int silver, int bronze){
	        this.num=num;
	        this.gold = gold;
	        this.silver = silver;
	        this.bronze = bronze;
	    }

		@Override
		public int compareTo(Country o) {
			 if (this.gold == o.gold) {
	                if (this.silver == o.silver) {
	                    return o.bronze - this.bronze;
	                }
	                else return o.silver - this.silver;
	            }
	            else
	                return o.gold - this.gold;
	        }
	    }

	    public static void main(String[] args) throws IOException {

	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st = new StringTokenizer(br.readLine());

	        int n = Integer.parseInt(st.nextToken());
	        int t = Integer.parseInt(st.nextToken());

	        ArrayList<Country> list = new ArrayList<>();

	        for (int i = 0; i < n; i++) {
	            StringTokenizer tmp = new StringTokenizer(br.readLine());
	            int num = Integer.parseInt(tmp.nextToken());
	            int gold = Integer.parseInt(tmp.nextToken());
	            int silver = Integer.parseInt(tmp.nextToken());
	            int bronze = Integer.parseInt(tmp.nextToken());

	            Country nation = new Country(num, gold, silver, bronze);
	            list.add(nation);
	        }

	        Collections.sort(list);

	        int rate = 1;
	        int cnt = 1;

	        if (list.get(0).num == t) {
	            System.out.println(1);
	            return;
	        }

	        for (int i = 1; i < n; i++) {

	        	Country prev = list.get(i-1);
	        	Country cur = list.get(i);

	            if ((prev.gold != cur.gold) || (prev.silver != cur.silver) || (prev.bronze != cur.bronze)) {
	                rate += cnt;
	                cnt = 1;
	            }
	            else
	                cnt++;

	            if (cur.num == t) {
	                System.out.println(rate);
	                break;
	            }
	        }
	    }

	}
