package zdu.parsdemo;

import zdu.parsdemo.GramSym;
import zdu.parsdemo.Grammar;
import zdu.parsdemo.NonTerm;
import zdu.parsdemo.Rule;
import zdu.parsdemo.SRAct;
import zdu.parsdemo.ANSICGrammar;
import zdu.parsdemo.SparseTable2;
import zdu.parsdemo.Terminal;

class ANSICTable extends SRTable {

    ANSICTable(ANSICGrammar g) {

    super(N_STATES, g);

    SRState[] states = new SRState[N_STATES];

    for (int i = 0; i < N_STATES; i++) {
      states[i] = (SRState) getRow(i);
    }

    

  }

  static final int N_STATES = 350;
}
