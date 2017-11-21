import java.util.*;

// single-line (str)
public class Main {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
    }
}

// single-line (int)
public class Main {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    }
}

// m n
public class Main {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
		String[] arr = str.split(" ");
    }
}

/*
n
a_1
a_2
.
a_n
*/
public class Main {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		sc.nextLine();

		ArrayList<String> list = new ArrayList<String>();

		while(sc.hasNext()){
			list.add(sc.nextLine());
		}
		System.out.println(list.toString());
	}
}


/*
n
p_11 p_12 p_13 ... (str)
p_21 p_22 p_23 ... (str)
...
p_n1 p_n2 p_n3 ... (str)
*/
public class Main {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		sc.nextLine();

		ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();

		while(sc.hasNext()){
			ArrayList<String> row = new ArrayList<String>(Arrays.asList(sc.nextLine().split(" ")));
			list.add(row);
		}
		System.out.println(list.toString());
    }
}
