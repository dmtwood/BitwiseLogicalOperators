class BitLogic {
    public static void main(String[] args) {
        String binaries[] = {
                "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
        };
        int a = 3;                      // in binary >> 0011     ( 1 + 2 )
        int b = 6;                      // in binary >> 0110     ( 2 + 4 )
        int c = a | b;                  // OR
        int d = a & b;                  // AND
        int e = a ^ b;                  // eXcl. OR
        int f = ( ~a & b ) | ( a & ~b ); // (NOT AND) OR (AND NOT)
        int g = ~a & 0x0f;

        System.out.println("                      a = " + binaries[a]);
        System.out.println("                      b = " + binaries[b]);

        // 0011 OR 0110 >> 0111     (1 if one is 1)
        System.out.println("                  a | b = " + binaries[c]);

        // 0011 AND 0110 >> 0010    (1 if both are 1)
        System.out.println("                  a & b = " + binaries[d]);

        // 0011 XOR 0110 >> 0101    (1 if just one is 1)
        System.out.println("                  a ^ b = " + binaries[e]);

        // (NOT 0011 AND 0110) OR (0011 AND NOT 0010) >>
        // (1100 AND 0110) OR (0011 AND 1101) >>
        // 0100 OR 0001 >> 0101
        System.out.println("( ~a & b ) | ( a & ~b ) = " + binaries[f]);

        // 0011 >> 1100
        System.out.println("              ~a & 0x0f = " + binaries[g]);


        // use the left shift operator " << " to shift the byte value
        // << X means all bits are shifted left X positions
        // thus X most left bits get lost, X get created on the right, filled with 0's
        byte h = 64, i;
        int j;

        j = h << 2;
        // when casting to byte, only 8 positions remain, while the only 1 in 256 is deleted because it is on position 9
        i = (byte) (h << 2);
        System.out.println();
        System.out.println("--- Leftshiting ----");
        System.out.println("Original value of h: " + h);
        System.out.println("Left shifted 2 bytes: " + i);
        System.out.println("Then cast to byte: " + j);


        // use << as quick multiplier but careful (when a 1 bit is shifted into bit 31, the nr is interpreted as negative)
        int k, num = 0xFFFFFFE;
        for (i=0; i<4; i++){
            num = num << 1;
            System.out.println(num);
        }


        // when shifting right, the remainder get's lost
        int l = 32;
        int m = 35;
        l = l >> 2;
        System.out.println("32 >> 2: " + l);
        m = m >> 2;
        System.out.println("35 >> 2: " + m);
    }
}
