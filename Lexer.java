// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: Documents/Compiladores/Compilador_VB6.0/Lexer.flex


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
class Lexer {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;
  public static final int STRING = 2;
  public static final int COMENTARIO = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1,  1,  2, 2
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\12\0\1\1\2\2\1\3\22\0\1\4\1\0\1\5"+
    "\3\0\1\6\1\7\1\10\1\11\2\12\1\0\1\12"+
    "\1\13\1\12\12\14\2\0\1\15\1\16\1\17\2\0"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\2\26\1\27"+
    "\2\26\1\30\1\31\1\32\1\33\2\26\1\34\1\35"+
    "\1\36\2\26\1\37\3\26\4\0\1\40\1\0\1\41"+
    "\1\42\1\26\1\43\1\44\1\45\1\46\1\47\1\50"+
    "\2\26\1\51\1\52\1\53\1\54\2\26\1\55\1\56"+
    "\1\57\1\60\5\26\12\0\1\2\u01a2\0\2\2\326\0"+
    "\u0100\2";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\3\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\3\11\15\12\1\1\2\13\1\2\1\0\1\12"+
    "\1\14\6\12\1\15\3\12\1\16\4\12\1\0\1\17"+
    "\2\12\1\20\5\12\1\21\1\12\1\22\2\12\2\23"+
    "\2\12\1\24\1\0\4\12\1\25\1\26\3\12\3\0"+
    "\1\27\5\12\1\30\1\31\2\0\1\12\1\32\1\33"+
    "\1\34\1\12\1\0\1\35\1\36\7\0\1\37\12\0"+
    "\1\40\1\0\1\41";

  private static int [] zzUnpackAction() {
    int [] result = new int[123];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\61\0\142\0\223\0\304\0\223\0\365\0\223"+
    "\0\223\0\223\0\223\0\223\0\u0126\0\u0157\0\223\0\u0188"+
    "\0\u01b9\0\u01ea\0\u021b\0\u024c\0\u027d\0\u02ae\0\u02df\0\u0310"+
    "\0\u0341\0\u0372\0\u03a3\0\u03d4\0\u0405\0\u0436\0\223\0\u0467"+
    "\0\u0498\0\u04c9\0\u04fa\0\u02df\0\u052b\0\u055c\0\u058d\0\u05be"+
    "\0\u05ef\0\u0620\0\u02df\0\u0651\0\u0682\0\u06b3\0\u02df\0\u06e4"+
    "\0\u0715\0\u0746\0\u0777\0\u07a8\0\u02df\0\u07d9\0\u080a\0\u02df"+
    "\0\u083b\0\u086c\0\u089d\0\u08ce\0\u08ff\0\u02df\0\u0930\0\u02df"+
    "\0\u0961\0\u0992\0\u09c3\0\223\0\u09f4\0\u0a25\0\u0a56\0\u0a87"+
    "\0\u0ab8\0\u0ae9\0\u0b1a\0\u0b4b\0\u02df\0\u02df\0\u0b7c\0\u0bad"+
    "\0\u0bde\0\u0c0f\0\u0c40\0\u0c71\0\u02df\0\u0ca2\0\u0cd3\0\u0d04"+
    "\0\u0d35\0\u0d66\0\u02df\0\223\0\u0d97\0\u0dc8\0\u0df9\0\u02df"+
    "\0\u02df\0\u02df\0\u0e2a\0\u0e5b\0\223\0\u02df\0\u0e8c\0\u0ebd"+
    "\0\u0eee\0\u0f1f\0\u0f50\0\u0f81\0\u0fb2\0\223\0\u0fe3\0\u1014"+
    "\0\u1045\0\u1076\0\u10a7\0\u10d8\0\u1109\0\u113a\0\u116b\0\u119c"+
    "\0\223\0\u11cd\0\223";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[123];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\1\5\1\0\1\6\1\7\1\10\1\4\1\11"+
    "\1\12\1\13\1\14\1\4\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\1\27\1\31\1\32\1\33\1\27\1\34\1\35\1\27"+
    "\1\36\20\27\1\6\3\0\1\6\1\37\54\6\1\40"+
    "\1\0\1\37\55\6\64\0\1\6\61\0\1\41\1\0"+
    "\1\42\66\0\1\15\62\0\2\17\57\0\1\17\56\0"+
    "\1\27\3\0\33\27\1\43\2\27\1\44\2\27\14\0"+
    "\1\27\3\0\34\27\1\45\4\27\14\0\1\27\3\0"+
    "\34\27\1\46\4\27\14\0\1\27\3\0\30\27\1\47"+
    "\10\27\14\0\1\27\3\0\31\27\1\50\1\27\1\51"+
    "\5\27\14\0\1\27\3\0\21\27\1\52\17\27\14\0"+
    "\1\27\3\0\41\27\14\0\1\27\3\0\25\27\1\53"+
    "\5\27\1\54\5\27\14\0\1\27\3\0\34\27\1\55"+
    "\4\27\14\0\1\27\3\0\34\27\1\56\4\27\14\0"+
    "\1\27\3\0\35\27\1\57\3\27\14\0\1\27\3\0"+
    "\37\27\1\60\1\61\14\0\1\27\3\0\27\27\1\62"+
    "\5\27\1\63\3\27\20\0\20\27\1\0\20\27\3\0"+
    "\1\37\61\0\1\41\114\0\1\64\34\0\1\27\3\0"+
    "\23\27\1\65\15\27\14\0\1\27\3\0\34\27\1\66"+
    "\4\27\14\0\1\27\3\0\33\27\1\67\5\27\14\0"+
    "\1\27\3\0\32\27\1\70\6\27\14\0\1\27\3\0"+
    "\36\27\1\71\2\27\14\0\1\27\3\0\23\27\1\72"+
    "\15\27\14\0\1\27\3\0\31\27\1\73\7\27\14\0"+
    "\1\27\3\0\37\27\1\74\1\27\14\0\1\27\3\0"+
    "\23\27\1\75\15\27\14\0\1\27\3\0\37\27\1\76"+
    "\1\27\14\0\1\27\3\0\35\27\1\77\3\27\14\0"+
    "\1\27\3\0\22\27\1\100\16\27\14\0\1\27\3\0"+
    "\24\27\1\101\14\27\14\0\1\27\3\0\40\27\1\102"+
    "\1\0\1\103\1\0\1\104\71\0\1\27\3\0\31\27"+
    "\1\105\7\27\14\0\1\27\3\0\36\27\1\106\2\27"+
    "\14\0\1\27\3\0\24\27\1\107\14\27\4\0\1\110"+
    "\7\0\1\27\3\0\41\27\14\0\1\27\3\0\36\27"+
    "\1\111\2\27\14\0\1\27\3\0\24\27\1\112\14\27"+
    "\14\0\1\27\3\0\40\27\1\113\14\0\1\27\3\0"+
    "\30\27\1\114\10\27\14\0\1\27\3\0\33\27\1\115"+
    "\5\27\14\0\1\27\3\0\24\27\1\116\14\27\3\0"+
    "\1\104\71\0\1\27\3\0\24\27\1\117\14\27\14\0"+
    "\1\27\3\0\34\27\1\120\4\27\14\0\1\27\3\0"+
    "\7\27\1\121\31\27\27\0\1\122\1\0\1\123\3\0"+
    "\1\124\37\0\1\27\3\0\24\27\1\125\14\27\14\0"+
    "\1\27\3\0\26\27\1\126\12\27\14\0\1\27\3\0"+
    "\31\27\1\127\7\27\14\0\1\27\3\0\33\27\1\130"+
    "\5\27\14\0\1\27\3\0\21\27\1\131\17\27\14\0"+
    "\1\27\3\0\31\27\1\132\7\27\14\0\1\27\3\0"+
    "\25\27\1\133\13\27\45\0\1\134\67\0\1\135\64\0"+
    "\1\136\14\0\1\27\3\0\24\27\1\137\14\27\14\0"+
    "\1\27\3\0\24\27\1\140\14\27\14\0\1\27\3\0"+
    "\26\27\1\141\12\27\14\0\1\27\3\0\33\27\1\142"+
    "\5\27\14\0\1\27\3\0\24\27\1\143\14\27\43\0"+
    "\1\144\57\0\1\145\32\0\1\27\3\0\35\27\1\146"+
    "\3\27\13\0\1\147\1\27\3\0\41\27\60\0\1\150"+
    "\34\0\1\151\2\0\1\152\72\0\1\153\53\0\1\154"+
    "\71\0\1\155\47\0\1\156\55\0\1\157\67\0\1\160"+
    "\53\0\1\161\74\0\1\162\31\0\1\163\74\0\1\164"+
    "\64\0\1\165\40\0\1\166\103\0\1\167\55\0\1\170"+
    "\54\0\1\171\67\0\1\172\51\0\1\173\14\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4606];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\11\1\1\1\11\1\1\5\11\2\1\1\11"+
    "\17\1\1\11\2\1\1\0\21\1\1\0\17\1\1\11"+
    "\3\1\1\0\11\1\3\0\7\1\1\11\2\0\5\1"+
    "\1\0\1\11\1\1\7\0\1\11\12\0\1\11\1\0"+
    "\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[123];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return YYEOF;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { System.out.println("Token no reconocido en: " + yyline + " " + yycolumn);
            }
            // fall through
          case 34: break;
          case 2:
            { 
            }
            // fall through
          case 35: break;
          case 3:
            { System.out.println("STRING");yybegin(STRING);
            }
            // fall through
          case 36: break;
          case 4:
            { System.out.println("COMENTARIO");yybegin(COMENTARIO);
            }
            // fall through
          case 37: break;
          case 5:
            { System.out.println("INICIO PARENTESIS");
            }
            // fall through
          case 38: break;
          case 6:
            { System.out.println("FIN PARENTESIS");
            }
            // fall through
          case 39: break;
          case 7:
            { System.out.println("OPARIT");
            }
            // fall through
          case 40: break;
          case 8:
            { System.out.println("INTEGER");
            }
            // fall through
          case 41: break;
          case 9:
            { System.out.println("OPREL");
            }
            // fall through
          case 42: break;
          case 10:
            { System.out.println("IDENTIFICADOR");
            }
            // fall through
          case 43: break;
          case 11:
            { yybegin(YYINITIAL);
            }
            // fall through
          case 44: break;
          case 12:
            { System.out.println("AS");
            }
            // fall through
          case 45: break;
          case 13:
            { System.out.println("IF");
            }
            // fall through
          case 46: break;
          case 14:
            { System.out.println("OR");
            }
            // fall through
          case 47: break;
          case 15:
            { System.out.println("AND");
            }
            // fall through
          case 48: break;
          case 16:
            { System.out.println("DIM");
            }
            // fall through
          case 49: break;
          case 17:
            { System.out.println("NOT");
            }
            // fall through
          case 50: break;
          case 18:
            { System.out.println("SUB");
            }
            // fall through
          case 51: break;
          case 19:
            { System.out.println("EXTENDER STRING");
            }
            // fall through
          case 52: break;
          case 20:
            { System.out.println("ELSE");
            }
            // fall through
          case 53: break;
          case 21:
            { System.out.println("THEN");
            }
            // fall through
          case 54: break;
          case 22:
            { System.out.println("TRUE");
            }
            // fall through
          case 55: break;
          case 23:
            { System.out.println("FALSE");
            }
            // fall through
          case 56: break;
          case 24:
            { System.out.println("ELSEIF");
            }
            // fall through
          case 57: break;
          case 25:
            { System.out.println("ENDIF");
            }
            // fall through
          case 58: break;
          case 26:
            { System.out.println("MODULE");
            }
            // fall through
          case 59: break;
          case 27:
            { System.out.println("STRINGTYPE");
            }
            // fall through
          case 60: break;
          case 28:
            { System.out.println("BOOLEANTYPE");
            }
            // fall through
          case 61: break;
          case 29:
            { System.out.println("ENDSUB");
            }
            // fall through
          case 62: break;
          case 30:
            { System.out.println("INTEGERTYPE");
            }
            // fall through
          case 63: break;
          case 31:
            { System.out.println("ENDMODULE");
            }
            // fall through
          case 64: break;
          case 32:
            { System.out.println("READ CONSOLE");
            }
            // fall through
          case 65: break;
          case 33:
            { System.out.println("WRITE IN CONSOLE");
            }
            // fall through
          case 66: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
