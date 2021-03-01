// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: Documents/Compiladores/Compilador_VB6.0/Lexer.flex

import java_cup.runtime.Symbol;

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
    "\1\0\1\u0100\36\u0200\1\u0300\267\u0200\10\u0400\u1020\u0200";

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
    "\3\0\1\6\1\7\1\10\1\11\1\12\1\13\1\0"+
    "\1\13\1\14\1\12\12\15\2\0\1\16\1\17\1\20"+
    "\2\0\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\1\31\2\32\1\33\1\34\1\35\1\36\1\37"+
    "\1\32\1\40\1\41\1\42\1\43\1\32\1\44\1\45"+
    "\2\32\4\0\1\46\1\0\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\2\32\1\33\1\34"+
    "\1\35\1\36\1\37\1\32\1\40\1\41\1\42\1\43"+
    "\1\32\1\44\1\45\2\32\12\0\1\2\252\0\2\47"+
    "\115\0\1\50\u01a8\0\2\2\326\0\u0100\2";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1280];
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
    "\3\0\1\1\2\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\3\14\21\15\3\1\1\16"+
    "\1\17\1\3\2\20\1\3\1\0\1\15\2\21\3\15"+
    "\1\22\1\0\5\15\1\23\5\15\1\24\4\15\1\25"+
    "\3\15\1\23\4\0\1\26\2\15\2\27\1\15\1\0"+
    "\1\30\1\15\1\0\1\15\1\31\4\15\1\32\3\15"+
    "\1\33\4\15\4\0\1\33\2\34\3\15\1\0\2\35"+
    "\2\36\1\15\1\0\1\15\1\37\1\15\1\40\1\15"+
    "\1\41\2\15\1\0\1\42\1\43\1\15\1\0\1\15"+
    "\2\0\1\41\1\0\3\15\2\0\1\15\1\0\2\44"+
    "\5\15\1\0\2\45\2\46\2\0\3\15\2\0\2\47"+
    "\1\15\1\50\1\51\1\52\1\15\1\52\2\0\1\53"+
    "\2\15\2\0\1\54\1\15\1\54\2\0\2\55\1\15"+
    "\3\0\2\56\14\0\1\57\1\0\1\60";

  private static int [] zzUnpackAction() {
    int [] result = new int[207];
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
    "\0\0\0\51\0\122\0\173\0\244\0\173\0\315\0\173"+
    "\0\173\0\173\0\173\0\173\0\173\0\173\0\366\0\u011f"+
    "\0\173\0\u0148\0\u0171\0\u019a\0\u01c3\0\u01ec\0\u0215\0\u023e"+
    "\0\u0267\0\u0290\0\u02b9\0\u02e2\0\u030b\0\u0334\0\u035d\0\u0386"+
    "\0\u03af\0\u03d8\0\u0401\0\u042a\0\u0453\0\u047c\0\173\0\173"+
    "\0\173\0\u04a5\0\173\0\u04ce\0\u04f7\0\u0520\0\u0267\0\173"+
    "\0\u0549\0\u0572\0\u059b\0\u0267\0\u05c4\0\u05ed\0\u0616\0\u063f"+
    "\0\u0668\0\u0691\0\u0267\0\u06ba\0\u06e3\0\u070c\0\u0735\0\u075e"+
    "\0\u0267\0\u0787\0\u07b0\0\u07d9\0\u0802\0\u0267\0\u082b\0\u0854"+
    "\0\u087d\0\173\0\u08a6\0\u08cf\0\u08f8\0\u0921\0\u0267\0\u094a"+
    "\0\u0973\0\u0267\0\173\0\u099c\0\u09c5\0\u0267\0\u09ee\0\u0a17"+
    "\0\u0a40\0\u0267\0\u0a69\0\u0a92\0\u0abb\0\u0ae4\0\u0267\0\u0b0d"+
    "\0\u0b36\0\u0b5f\0\u0267\0\u0b88\0\u0bb1\0\u0bda\0\u0c03\0\u0c2c"+
    "\0\u0c55\0\u0c7e\0\u0ca7\0\173\0\u0cd0\0\173\0\u0cf9\0\u0d22"+
    "\0\u0d4b\0\u0d74\0\u0d9d\0\u0dc6\0\u0267\0\173\0\u0def\0\u0e18"+
    "\0\u0e41\0\u0267\0\u0e6a\0\u0267\0\u0e93\0\u0267\0\u0ebc\0\u0ee5"+
    "\0\u0f0e\0\u0267\0\u0267\0\u0f37\0\u0f60\0\u0f89\0\u0fb2\0\u0fdb"+
    "\0\173\0\u1004\0\u102d\0\u1056\0\u107f\0\u10a8\0\u10d1\0\u10fa"+
    "\0\u1123\0\u0267\0\173\0\u114c\0\u1175\0\u119e\0\u11c7\0\u11f0"+
    "\0\u1219\0\u0267\0\173\0\u0267\0\173\0\u1242\0\u126b\0\u1294"+
    "\0\u12bd\0\u12e6\0\u130f\0\u1338\0\u0267\0\173\0\u1361\0\u0267"+
    "\0\u0267\0\u0267\0\u138a\0\173\0\u13b3\0\u13dc\0\u0267\0\u1405"+
    "\0\u142e\0\u1457\0\u1480\0\u0267\0\u14a9\0\173\0\u14d2\0\u14fb"+
    "\0\u0267\0\173\0\u1524\0\u154d\0\u1576\0\u159f\0\u0267\0\173"+
    "\0\u15c8\0\u15f1\0\u161a\0\u1643\0\u166c\0\u1695\0\u16be\0\u16e7"+
    "\0\u1710\0\u1739\0\u1762\0\u178b\0\173\0\u17b4\0\173";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[207];
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
    "\1\4\1\5\1\0\1\6\1\7\1\10\1\11\1\12"+
    "\1\13\1\14\1\15\1\16\1\4\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\2\31"+
    "\1\32\1\31\1\33\1\34\1\35\1\36\1\31\1\37"+
    "\1\40\1\41\1\42\1\43\1\31\1\44\1\45\1\46"+
    "\1\47\3\0\1\47\1\50\43\47\1\51\1\52\1\0"+
    "\1\53\45\51\54\0\1\6\51\0\1\54\1\0\1\55"+
    "\57\0\1\17\52\0\2\21\47\0\1\21\46\0\1\31"+
    "\3\0\14\31\1\56\3\31\1\57\5\31\1\0\1\60"+
    "\15\0\1\31\3\0\15\31\1\61\10\31\17\0\1\31"+
    "\3\0\15\31\1\62\10\31\17\0\1\31\3\0\10\31"+
    "\1\63\4\31\1\64\10\31\1\65\16\0\1\31\3\0"+
    "\12\31\1\66\1\31\1\67\7\31\1\70\1\31\17\0"+
    "\1\31\3\0\1\71\14\31\1\72\10\31\17\0\1\31"+
    "\3\0\26\31\17\0\1\31\3\0\5\31\1\73\6\31"+
    "\1\74\11\31\17\0\1\31\3\0\15\31\1\75\10\31"+
    "\17\0\1\31\3\0\15\31\1\76\10\31\17\0\1\31"+
    "\3\0\4\31\1\77\10\31\1\100\10\31\17\0\1\31"+
    "\3\0\17\31\1\101\6\31\17\0\1\31\3\0\4\31"+
    "\1\102\21\31\17\0\1\31\3\0\21\31\1\103\1\104"+
    "\3\31\17\0\1\31\3\0\7\31\1\105\5\31\1\106"+
    "\1\31\1\107\6\31\17\0\1\31\3\0\14\31\1\110"+
    "\11\31\17\0\1\31\3\0\7\31\1\111\16\31\23\0"+
    "\25\31\31\0\1\112\6\0\1\113\55\0\1\114\1\115"+
    "\10\0\1\53\51\0\1\54\112\0\1\116\17\0\1\31"+
    "\3\0\3\31\1\117\22\31\17\0\1\31\3\0\15\31"+
    "\1\120\10\31\17\0\1\31\3\0\14\31\1\121\11\31"+
    "\17\0\1\31\3\0\13\31\1\122\12\31\36\0\1\123"+
    "\31\0\1\31\3\0\20\31\1\124\5\31\1\0\1\125"+
    "\15\0\1\31\3\0\3\31\1\126\22\31\17\0\1\31"+
    "\3\0\10\31\1\127\15\31\1\130\16\0\1\31\3\0"+
    "\12\31\1\131\13\31\17\0\1\31\3\0\17\31\1\132"+
    "\6\31\17\0\1\31\3\0\21\31\1\133\4\31\17\0"+
    "\1\31\3\0\15\31\1\134\10\31\17\0\1\31\3\0"+
    "\3\31\1\135\22\31\17\0\1\31\3\0\24\31\1\136"+
    "\1\31\17\0\1\31\3\0\21\31\1\137\4\31\17\0"+
    "\1\31\3\0\21\31\1\140\4\31\17\0\1\31\3\0"+
    "\4\31\1\141\12\31\1\142\6\31\17\0\1\31\3\0"+
    "\1\31\1\143\24\31\17\0\1\31\3\0\4\31\1\144"+
    "\21\31\17\0\1\31\3\0\22\31\1\145\3\31\17\0"+
    "\1\31\3\0\21\31\1\146\4\31\17\0\1\31\3\0"+
    "\10\31\1\147\15\31\1\150\43\0\1\151\33\0\1\152"+
    "\12\0\1\153\32\0\1\154\27\0\1\155\1\0\1\156"+
    "\62\0\1\31\3\0\12\31\1\157\13\31\17\0\1\31"+
    "\3\0\20\31\1\160\1\161\4\31\1\0\1\162\15\0"+
    "\1\31\3\0\4\31\1\163\21\31\27\0\1\164\40\0"+
    "\1\31\3\0\21\31\1\165\4\31\44\0\1\166\23\0"+
    "\1\31\3\0\20\31\1\167\5\31\1\0\1\170\15\0"+
    "\1\31\3\0\4\31\1\171\21\31\17\0\1\31\3\0"+
    "\16\31\1\172\7\31\17\0\1\31\3\0\22\31\1\173"+
    "\3\31\17\0\1\31\3\0\21\31\1\174\4\31\17\0"+
    "\1\31\3\0\22\31\1\175\3\31\17\0\1\31\3\0"+
    "\16\31\1\176\7\31\17\0\1\31\3\0\10\31\1\177"+
    "\11\31\1\200\3\31\1\201\16\0\1\31\3\0\14\31"+
    "\1\202\11\31\17\0\1\31\3\0\4\31\1\203\21\31"+
    "\17\0\1\31\3\0\10\31\1\204\15\31\1\205\16\0"+
    "\1\31\3\0\12\31\1\206\13\31\35\0\1\207\42\0"+
    "\1\210\62\0\1\211\42\0\1\201\11\0\1\212\3\0"+
    "\1\201\4\0\1\156\62\0\1\31\3\0\4\31\1\213"+
    "\21\31\17\0\1\31\3\0\15\31\1\214\10\31\17\0"+
    "\1\31\3\0\10\31\1\215\15\31\1\216\37\0\1\217"+
    "\27\0\1\31\3\0\10\31\1\220\15\31\1\221\32\0"+
    "\1\221\15\0\1\221\16\0\1\31\3\0\4\31\1\222"+
    "\21\31\27\0\1\223\40\0\1\31\3\0\6\31\1\224"+
    "\17\31\17\0\1\31\3\0\12\31\1\225\13\31\17\0"+
    "\1\31\3\0\17\31\1\226\6\31\17\0\1\31\3\0"+
    "\14\31\1\227\11\31\17\0\1\31\3\0\2\31\1\230"+
    "\23\31\37\0\1\231\30\0\1\31\3\0\12\31\1\232"+
    "\13\31\35\0\1\233\32\0\1\31\3\0\4\31\1\234"+
    "\21\31\27\0\1\235\52\0\1\236\44\0\1\237\42\0"+
    "\1\31\3\0\1\240\25\31\17\0\1\31\3\0\12\31"+
    "\1\241\13\31\17\0\1\31\3\0\14\31\1\242\11\31"+
    "\37\0\1\243\46\0\1\244\32\0\1\31\3\0\5\31"+
    "\1\245\20\31\30\0\1\246\37\0\1\31\3\0\4\31"+
    "\1\247\21\31\17\0\1\31\3\0\4\31\1\250\21\31"+
    "\17\0\1\31\3\0\14\31\1\251\11\31\17\0\1\31"+
    "\3\0\6\31\1\252\17\31\17\0\1\31\3\0\21\31"+
    "\1\253\4\31\31\0\1\254\46\0\1\255\65\0\1\256"+
    "\23\0\1\31\3\0\14\31\1\257\11\31\17\0\1\31"+
    "\3\0\4\31\1\260\21\31\17\0\1\31\3\0\22\31"+
    "\1\261\3\31\45\0\1\262\32\0\1\263\40\0\1\31"+
    "\3\0\17\31\1\264\6\31\17\0\1\31\3\0\22\31"+
    "\1\265\3\31\42\0\1\266\53\0\1\267\21\0\1\270"+
    "\1\31\3\0\26\31\17\0\1\31\3\0\4\31\1\271"+
    "\21\31\27\0\1\272\37\0\1\270\51\0\1\31\3\0"+
    "\17\31\1\273\6\31\42\0\1\274\50\0\1\275\3\0"+
    "\1\276\21\0\1\31\3\0\4\31\1\277\21\31\27\0"+
    "\1\300\50\0\1\301\63\0\1\302\31\0\1\303\60\0"+
    "\1\304\15\0\1\304\25\0\1\305\66\0\1\306\41\0"+
    "\1\307\42\0\1\310\54\0\1\311\15\0\1\311\34\0"+
    "\1\312\52\0\1\313\44\0\1\314\15\0\1\314\26\0"+
    "\1\315\60\0\1\316\40\0\1\317\23\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6109];
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
    "\3\0\1\11\1\1\1\11\1\1\7\11\2\1\1\11"+
    "\25\1\3\11\1\1\1\11\1\1\1\0\2\1\1\11"+
    "\4\1\1\0\24\1\1\11\4\0\4\1\1\11\1\1"+
    "\1\0\2\1\1\0\17\1\4\0\1\11\1\1\1\11"+
    "\3\1\1\0\3\1\1\11\1\1\1\0\10\1\1\0"+
    "\3\1\1\0\1\1\2\0\1\11\1\0\3\1\2\0"+
    "\1\1\1\0\1\1\1\11\5\1\1\0\1\1\1\11"+
    "\1\1\1\11\2\0\3\1\2\0\1\1\1\11\5\1"+
    "\1\11\2\0\3\1\2\0\2\1\1\11\2\0\1\1"+
    "\1\11\1\1\3\0\1\1\1\11\14\0\1\11\1\0"+
    "\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[207];
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
            { System.out.println("Error léxico en: " + yyline + " " + yycolumn);
            }
            // fall through
          case 49: break;
          case 2:
            { System.out.println("ENTER");
            }
            // fall through
          case 50: break;
          case 3:
            { 
            }
            // fall through
          case 51: break;
          case 4:
            { System.out.println("STRING");yybegin(STRING);
            }
            // fall through
          case 52: break;
          case 5:
            { System.out.println("CONCAT STRING");
            }
            // fall through
          case 53: break;
          case 6:
            { System.out.println("COMENTARIO");yybegin(COMENTARIO);
            }
            // fall through
          case 54: break;
          case 7:
            { System.out.println("INICIO PARENTESIS");
            }
            // fall through
          case 55: break;
          case 8:
            { System.out.println("FIN PARENTESIS");
            }
            // fall through
          case 56: break;
          case 9:
            { System.out.println("OP MULTIPLICACION");
            }
            // fall through
          case 57: break;
          case 10:
            { System.out.println("OP ADICION");
            }
            // fall through
          case 58: break;
          case 11:
            { System.out.println("INTEGER");
            }
            // fall through
          case 59: break;
          case 12:
            { System.out.println("OP REL");
            }
            // fall through
          case 60: break;
          case 13:
            { System.out.println(yytext());
            }
            // fall through
          case 61: break;
          case 14:
            { System.out.print(yytext());
            }
            // fall through
          case 62: break;
          case 15:
            { System.out.println();yybegin(YYINITIAL);
            }
            // fall through
          case 63: break;
          case 16:
            { yybegin(YYINITIAL);
            }
            // fall through
          case 64: break;
          case 17:
            { System.out.println("AS");
            }
            // fall through
          case 65: break;
          case 18:
            { System.out.println("DO");
            }
            // fall through
          case 66: break;
          case 19:
            { System.out.println("IF");
            }
            // fall through
          case 67: break;
          case 20:
            { System.out.println("OR");
            }
            // fall through
          case 68: break;
          case 21:
            { System.out.println("TO");
            }
            // fall through
          case 69: break;
          case 22:
            { System.out.println("AND");
            }
            // fall through
          case 70: break;
          case 23:
            { System.out.println("DIM");
            }
            // fall through
          case 71: break;
          case 24:
            { System.out.println("END");
            }
            // fall through
          case 72: break;
          case 25:
            { System.out.println("FOR");
            }
            // fall through
          case 73: break;
          case 26:
            { System.out.println("NOT");
            }
            // fall through
          case 74: break;
          case 27:
            { System.out.println("SUB");
            }
            // fall through
          case 75: break;
          case 28:
            { System.out.println("EXTENDER STRING");
            }
            // fall through
          case 76: break;
          case 29:
            { System.out.println("ELSE");
            }
            // fall through
          case 77: break;
          case 30:
            { System.out.println("EXIT");
            }
            // fall through
          case 78: break;
          case 31:
            { System.out.println("LOOP");
            }
            // fall through
          case 79: break;
          case 32:
            { System.out.println("NEXT");
            }
            // fall through
          case 80: break;
          case 33:
            { System.out.println("STEP");
            }
            // fall through
          case 81: break;
          case 34:
            { System.out.println("THEN");
            }
            // fall through
          case 82: break;
          case 35:
            { System.out.println("TRUE");
            }
            // fall through
          case 83: break;
          case 36:
            { System.out.println("FALSE");
            }
            // fall through
          case 84: break;
          case 37:
            { System.out.println("UNTIL");
            }
            // fall through
          case 85: break;
          case 38:
            { System.out.println("WHILE");
            }
            // fall through
          case 86: break;
          case 39:
            { System.out.println("ELSE IF");
            }
            // fall through
          case 87: break;
          case 40:
            { System.out.println("MODULE");
            }
            // fall through
          case 88: break;
          case 41:
            { System.out.println("RETURN");
            }
            // fall through
          case 89: break;
          case 42:
            { System.out.println("STRINGTYPE");
            }
            // fall through
          case 90: break;
          case 43:
            { System.out.println("BOOLEANTYPE");
            }
            // fall through
          case 91: break;
          case 44:
            { System.out.println("INTEGERTYPE");
            }
            // fall through
          case 92: break;
          case 45:
            { System.out.println("CONTINUE");
            }
            // fall through
          case 93: break;
          case 46:
            { System.out.println("STRUCTURE");
            }
            // fall through
          case 94: break;
          case 47:
            { System.out.println("READ CONSOLE");
            }
            // fall through
          case 95: break;
          case 48:
            { System.out.println("WRITE IN CONSOLE");
            }
            // fall through
          case 96: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
