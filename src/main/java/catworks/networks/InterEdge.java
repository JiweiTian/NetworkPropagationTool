package catworks.networks;

public class InterEdge {
    int networkID;
    int sourceNodeID;
    int destNetworkID;
    int destNodeID;

    public InterEdge(int networkID, int sourceNodeID, int destNetworkID, int destNodeID) {
        this.networkID = networkID;
        this.sourceNodeID = sourceNodeID;
        this.destNetworkID = destNetworkID;
        this.destNodeID = destNodeID;
    }

    /*
     * [changeDestNode]
     * @param destID new destination node id
     */
    public void changeDestNode(int destID){
      this.destNodeID = destID;
    }

    @Override public String toString() {
        return "(" + networkID + ":" + sourceNodeID + " -> " + destNetworkID + ":" + destNodeID + ")";
    }
}