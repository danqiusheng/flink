package eu.stratosphere.pact.runtime.iterative.playing.connectedcomponents;

import eu.stratosphere.pact.common.stubs.Collector;
import eu.stratosphere.pact.common.stubs.MatchStub;
import eu.stratosphere.pact.common.type.PactRecord;
import eu.stratosphere.pact.common.type.base.PactLong;

public class UpdateCompontentIDMatch extends MatchStub {

  @Override
  public void match(PactRecord newVertexWithComponent, PactRecord currentVertexWithComponent,
      Collector<PactRecord> out) throws Exception {
//
//    long vid1 = newVertexWithComponent.getField(0, PactLong.class).getValue();
//    long cid1 = newVertexWithComponent.getField(1, PactLong.class).getValue();
//
//    long vid2 = currentVertexWithComponent.getField(0, PactLong.class).getValue();
//    long cid2 = currentVertexWithComponent.getField(1, PactLong.class).getValue();

//    String match = "(" + vid1 + "," + cid1 + ")<->(" + vid2 + "," + cid2 + ") ";
//    long vertexID = currentVertexWithComponent.getField(0, PactLong.class).getValue();

    long candidateComponentID = newVertexWithComponent.getField(1, PactLong.class).getValue();
    long currentComponentID = currentVertexWithComponent.getField(1, PactLong.class).getValue();

    if (candidateComponentID < currentComponentID) {
      //result.setField(0, currentVertexWithComponent.getField(0, PactLong.class));
      //result.setField(1, new PactLong(candidateComponentID));
      out.collect(newVertexWithComponent);
//      System.out.println("-------------- " + match + "Updating component of vertex " + vertexID + " to " + candidateComponentID);
    }
  }

}
