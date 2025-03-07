public class Run {
    public static void main(String[] args) {
        String oldSeq = "abcdef";
        String newSeq;
        String segment = "de";
        int segmentLength = segment.length();
        int index = oldSeq.indexOf(segment);
        newSeq = oldSeq.substring(0,index).concat(oldSeq.substring(index+segmentLength));
        System.out.println(newSeq);
    }

}
