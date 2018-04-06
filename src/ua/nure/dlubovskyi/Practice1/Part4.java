package ua.nure.dlubovskyi.practice1;

class Part4{
public static int nod(int x, int y) {
		while (x != y) {
			if (x > y)
				x -= y;
			else
				y -= x;
		}
		return x;
	}

	public static void main(String[] args) {
		if (args.length != 2) {
			for (String s: args ) {
			System.out.println(s);
			}
		}
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int nod = nod(x, y);
		System.out.println("NOD x=" + x + ", y=" + y + " --> " + nod);

}
}
