public class AsciiCharSequence implements java.lang.CharSequence{
    byte[] charBytes;

    public AsciiCharSequence(byte[] bytes){
        charBytes = bytes;
    }

    public int length() {
        return charBytes.length;
    }

    public char charAt(int index){
        return (char)charBytes[index];
    }

    public AsciiCharSequence subSequence(int start, int end){
        byte[] subChars = new byte[end - start + 1];
        for (int i = start; i < end; i++){
            subChars[i] = charBytes[i];
        }
        return new AsciiCharSequence(subChars);
    }

    public String toString(){
        StringBuilder str = new StringBuilder();
        for(byte byte1: charBytes){
            str.append((char)byte1);
        }
        return str.toString();
    }
}

