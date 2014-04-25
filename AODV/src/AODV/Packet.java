package AODV;

public interface Packet {
	public byte[] toBytes();
    
    public String SentString();
    
 //   public void parseBytes(byte[] rawPdu) throws BadPduFormatException;

    public int getDestinationAddress();
}
