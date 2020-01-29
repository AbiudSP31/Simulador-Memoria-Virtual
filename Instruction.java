public class Instruction 
{
  public String inst;
  public long addr;
  public int  addrSeg;

  public Instruction( String inst, long addr,  int addrSeg) 
  {
    this.inst = inst;
    this.addr = addr;
    this.addrSeg=addrSeg;
  } 	

}
