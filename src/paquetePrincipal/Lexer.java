package paquetePrincipal;
// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: src/paquetePrincipal/Lexer.flex

import java_cup.runtime.Symbol;

// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
class Lexer implements java_cup.runtime.Scanner {

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
    "\3\0\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\13\1\15\1\12\12\16\2\0\1\17\1\20\1\21"+
    "\2\0\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\1\31\1\32\2\33\1\34\1\35\1\36\1\37\1\40"+
    "\1\33\1\41\1\42\1\43\1\44\1\33\1\45\1\46"+
    "\2\33\4\0\1\47\1\0\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\2\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\33\1\41\1\42\1\43\1\44"+
    "\1\33\1\45\1\46\2\33\12\0\1\2\252\0\2\50"+
    "\115\0\1\51\u01a8\0\2\2\326\0\u0100\2";

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
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\16\20\20\3\1\1\21\1\22\1\3\2\23\1\16"+
    "\1\20\2\24\3\20\1\25\1\0\6\20\1\26\5\20"+
    "\1\27\4\20\1\30\2\20\1\26\4\0\1\31\2\20"+
    "\2\32\1\20\1\0\1\33\1\20\1\0\1\20\1\34"+
    "\4\20\1\35\1\20\1\36\2\20\1\37\3\20\3\0"+
    "\1\37\1\0\2\20\1\0\2\40\2\41\1\20\1\0"+
    "\2\20\1\42\1\20\1\43\3\20\1\0\1\44\1\45"+
    "\1\20\5\0\2\20\1\0\1\20\1\0\2\46\6\20"+
    "\1\0\2\47\3\0\2\20\1\0\2\50\1\20\1\0"+
    "\1\20\1\51\1\52\1\53\1\20\1\53\2\0\1\54"+
    "\1\20\1\0\1\20\1\0\1\55\1\20\1\55\2\0"+
    "\2\56\1\20\3\0\2\57\17\0\1\60\1\61";

  private static int [] zzUnpackAction() {
    int [] result = new int[203];
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
    "\0\0\0\52\0\124\0\176\0\250\0\176\0\322\0\176"+
    "\0\176\0\176\0\176\0\176\0\176\0\176\0\176\0\176"+
    "\0\374\0\u0126\0\176\0\u0150\0\u017a\0\u01a4\0\u01ce\0\u01f8"+
    "\0\u0222\0\u024c\0\u0276\0\u02a0\0\u02ca\0\u02f4\0\u031e\0\u0348"+
    "\0\u0372\0\u039c\0\u03c6\0\u03f0\0\u041a\0\u0444\0\u046e\0\176"+
    "\0\u0498\0\176\0\u04c2\0\176\0\176\0\u04ec\0\u0276\0\176"+
    "\0\u0516\0\u0540\0\u056a\0\u0276\0\u0594\0\u05be\0\u05e8\0\u0612"+
    "\0\u063c\0\u0666\0\u0690\0\u0276\0\u06ba\0\u06e4\0\u070e\0\u0738"+
    "\0\u0762\0\u0276\0\u078c\0\u07b6\0\u07e0\0\u080a\0\u0276\0\u0834"+
    "\0\u085e\0\176\0\u0888\0\u08b2\0\u08dc\0\u0906\0\u0276\0\u0930"+
    "\0\u095a\0\u0276\0\176\0\u0984\0\u09ae\0\u0276\0\u09d8\0\u0a02"+
    "\0\u0a2c\0\u0276\0\u0a56\0\u0a80\0\u0aaa\0\u0ad4\0\u0276\0\u0afe"+
    "\0\u0276\0\u0b28\0\u0b52\0\u0276\0\u0b7c\0\u0ba6\0\u0bd0\0\u0bfa"+
    "\0\u0c24\0\u0c4e\0\176\0\u0c78\0\u0ca2\0\u0ccc\0\u0cf6\0\u0d20"+
    "\0\u0d4a\0\u0276\0\176\0\u0d74\0\u0d9e\0\u0dc8\0\u0df2\0\u0276"+
    "\0\u0e1c\0\u0276\0\u0e46\0\u0e70\0\u0e9a\0\u0ec4\0\u0276\0\u0276"+
    "\0\u0eee\0\u0f18\0\u0f42\0\u0f6c\0\u0f96\0\u0fc0\0\u0fea\0\u1014"+
    "\0\u103e\0\u1068\0\u1092\0\u0276\0\176\0\u10bc\0\u10e6\0\u1110"+
    "\0\u113a\0\u1164\0\u118e\0\u11b8\0\u0276\0\176\0\u11e2\0\u120c"+
    "\0\u1236\0\u1260\0\u128a\0\u12b4\0\u0276\0\176\0\u12de\0\u1308"+
    "\0\u1332\0\u0276\0\u0276\0\u0276\0\u135c\0\176\0\u1386\0\u13b0"+
    "\0\u0276\0\u13da\0\u1404\0\u142e\0\u1458\0\u0276\0\u1482\0\176"+
    "\0\u14ac\0\u14d6\0\u0276\0\176\0\u1500\0\u152a\0\u1554\0\u157e"+
    "\0\u0276\0\176\0\u15a8\0\u15d2\0\u15fc\0\u1626\0\u1650\0\u167a"+
    "\0\u16a4\0\u16ce\0\u16f8\0\u1722\0\u174c\0\u1776\0\u17a0\0\u17ca"+
    "\0\u17f4\0\176\0\176";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[203];
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
    "\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\2\33\1\34\1\33\1\35\1\36\1\37\1\40\1\33"+
    "\1\41\1\42\1\43\1\33\1\44\1\33\1\45\1\46"+
    "\1\47\1\50\3\0\1\50\1\51\44\50\1\52\1\53"+
    "\1\0\1\54\46\52\55\0\1\6\52\0\1\7\63\0"+
    "\1\21\53\0\2\55\50\0\1\55\47\0\1\33\3\0"+
    "\14\33\1\56\3\33\1\57\5\33\1\0\1\60\16\0"+
    "\1\33\3\0\15\33\1\61\10\33\20\0\1\33\3\0"+
    "\15\33\1\62\10\33\20\0\1\33\3\0\10\33\1\63"+
    "\4\33\1\64\10\33\1\65\17\0\1\33\3\0\12\33"+
    "\1\66\1\33\1\67\7\33\1\70\1\33\20\0\1\33"+
    "\3\0\1\71\14\33\1\72\4\33\1\73\3\33\20\0"+
    "\1\33\3\0\26\33\20\0\1\33\3\0\5\33\1\74"+
    "\6\33\1\75\11\33\20\0\1\33\3\0\15\33\1\76"+
    "\10\33\20\0\1\33\3\0\15\33\1\77\10\33\20\0"+
    "\1\33\3\0\4\33\1\100\10\33\1\101\10\33\20\0"+
    "\1\33\3\0\17\33\1\102\6\33\20\0\1\33\3\0"+
    "\4\33\1\103\21\33\20\0\1\33\3\0\21\33\1\104"+
    "\1\105\3\33\20\0\1\33\3\0\7\33\1\106\5\33"+
    "\1\107\1\33\1\110\6\33\20\0\1\33\3\0\7\33"+
    "\1\111\16\33\24\0\25\33\32\0\1\112\6\0\1\113"+
    "\56\0\1\114\1\115\13\0\1\116\46\0\1\54\64\0"+
    "\1\33\3\0\3\33\1\117\22\33\20\0\1\33\3\0"+
    "\15\33\1\120\10\33\20\0\1\33\3\0\14\33\1\121"+
    "\11\33\20\0\1\33\3\0\13\33\1\122\12\33\37\0"+
    "\1\123\32\0\1\33\3\0\20\33\1\124\5\33\1\0"+
    "\1\125\16\0\1\33\3\0\3\33\1\126\22\33\20\0"+
    "\1\33\3\0\10\33\1\127\15\33\1\130\17\0\1\33"+
    "\3\0\12\33\1\131\13\33\20\0\1\33\3\0\17\33"+
    "\1\132\6\33\20\0\1\33\3\0\14\33\1\133\11\33"+
    "\20\0\1\33\3\0\21\33\1\134\4\33\20\0\1\33"+
    "\3\0\15\33\1\135\10\33\20\0\1\33\3\0\3\33"+
    "\1\136\22\33\20\0\1\33\3\0\23\33\1\137\1\140"+
    "\1\33\20\0\1\33\3\0\21\33\1\141\4\33\20\0"+
    "\1\33\3\0\21\33\1\142\4\33\20\0\1\33\3\0"+
    "\17\33\1\143\6\33\20\0\1\33\3\0\1\33\1\144"+
    "\24\33\20\0\1\33\3\0\4\33\1\145\21\33\20\0"+
    "\1\33\3\0\22\33\1\146\3\33\20\0\1\33\3\0"+
    "\10\33\1\147\15\33\1\150\44\0\1\151\47\0\1\152"+
    "\33\0\1\153\75\0\1\154\20\0\1\33\3\0\12\33"+
    "\1\155\13\33\20\0\1\33\3\0\20\33\1\156\5\33"+
    "\1\0\1\157\16\0\1\33\3\0\4\33\1\160\21\33"+
    "\30\0\1\161\41\0\1\33\3\0\21\33\1\162\4\33"+
    "\45\0\1\163\24\0\1\33\3\0\20\33\1\164\5\33"+
    "\1\0\1\165\16\0\1\33\3\0\2\33\1\166\23\33"+
    "\20\0\1\33\3\0\4\33\1\167\21\33\20\0\1\33"+
    "\3\0\16\33\1\170\7\33\20\0\1\33\3\0\22\33"+
    "\1\171\3\33\20\0\1\33\3\0\21\33\1\172\4\33"+
    "\20\0\1\33\3\0\22\33\1\173\3\33\20\0\1\33"+
    "\3\0\10\33\1\174\11\33\1\175\3\33\1\176\17\0"+
    "\1\33\3\0\14\33\1\177\11\33\20\0\1\33\3\0"+
    "\4\33\1\200\21\33\20\0\1\33\3\0\12\33\1\201"+
    "\13\33\36\0\1\202\43\0\1\203\55\0\1\176\11\0"+
    "\1\204\3\0\1\176\2\0\1\205\1\0\1\206\64\0"+
    "\1\33\3\0\4\33\1\207\21\33\20\0\1\33\3\0"+
    "\15\33\1\210\10\33\41\0\1\211\30\0\1\33\3\0"+
    "\10\33\1\212\15\33\1\213\33\0\1\213\15\0\1\213"+
    "\17\0\1\33\3\0\4\33\1\214\21\33\30\0\1\215"+
    "\41\0\1\33\3\0\21\33\1\216\4\33\20\0\1\33"+
    "\3\0\6\33\1\217\17\33\20\0\1\33\3\0\12\33"+
    "\1\220\13\33\20\0\1\33\3\0\17\33\1\221\6\33"+
    "\20\0\1\33\3\0\14\33\1\222\11\33\20\0\1\33"+
    "\3\0\2\33\1\223\23\33\40\0\1\224\31\0\1\33"+
    "\3\0\4\33\1\225\21\33\30\0\1\226\53\0\1\227"+
    "\45\0\1\230\30\0\1\206\1\231\51\0\1\231\63\0"+
    "\1\33\3\0\1\232\25\33\20\0\1\33\3\0\12\33"+
    "\1\233\13\33\36\0\1\234\33\0\1\33\3\0\5\33"+
    "\1\235\20\33\31\0\1\236\40\0\1\33\3\0\10\33"+
    "\1\237\15\33\1\240\17\0\1\33\3\0\4\33\1\241"+
    "\21\33\20\0\1\33\3\0\4\33\1\242\21\33\20\0"+
    "\1\33\3\0\14\33\1\243\11\33\20\0\1\33\3\0"+
    "\6\33\1\244\17\33\20\0\1\33\3\0\21\33\1\245"+
    "\4\33\32\0\1\246\47\0\1\247\66\0\1\250\12\0"+
    "\1\231\1\52\62\0\1\33\3\0\14\33\1\251\11\33"+
    "\20\0\1\33\3\0\4\33\1\252\21\33\30\0\1\253"+
    "\41\0\1\33\3\0\15\33\1\254\10\33\41\0\1\255"+
    "\30\0\1\33\3\0\17\33\1\256\6\33\20\0\1\33"+
    "\3\0\22\33\1\257\3\33\43\0\1\260\54\0\1\261"+
    "\22\0\1\262\1\33\3\0\26\33\17\0\1\262\52\0"+
    "\1\33\3\0\14\33\1\263\11\33\40\0\1\264\31\0"+
    "\1\33\3\0\17\33\1\265\6\33\43\0\1\266\51\0"+
    "\1\267\3\0\1\270\22\0\1\33\3\0\4\33\1\271"+
    "\21\33\30\0\1\272\51\0\1\273\64\0\1\274\32\0"+
    "\1\275\61\0\1\276\15\0\1\276\26\0\1\277\67\0"+
    "\1\300\42\0\1\301\43\0\1\302\55\0\1\303\15\0"+
    "\1\303\35\0\1\304\53\0\1\305\45\0\1\306\15\0"+
    "\1\306\27\0\1\307\61\0\1\310\23\0\1\311\67\0"+
    "\1\312\34\0\1\313\40\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6174];
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
    "\3\0\1\11\1\1\1\11\1\1\11\11\2\1\1\11"+
    "\24\1\1\11\1\1\1\11\1\1\2\11\2\1\1\11"+
    "\4\1\1\0\24\1\1\11\4\0\4\1\1\11\1\1"+
    "\1\0\2\1\1\0\17\1\3\0\1\11\1\0\2\1"+
    "\1\0\3\1\1\11\1\1\1\0\10\1\1\0\3\1"+
    "\5\0\2\1\1\0\1\1\1\0\1\1\1\11\6\1"+
    "\1\0\1\1\1\11\3\0\2\1\1\0\1\1\1\11"+
    "\1\1\1\0\5\1\1\11\2\0\2\1\1\0\1\1"+
    "\1\0\2\1\1\11\2\0\1\1\1\11\1\1\3\0"+
    "\1\1\1\11\17\0\2\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[203];
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
  private boolean zzEOFDone;

  /* user code: */
    String cadena = "";


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
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
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
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { System.out.println("Error léxico en: " + (yyline + 1) + " " + (yycolumn + 1));
            }
            // fall through
          case 50: break;
          case 2:
            { return new Symbol(sym.saltoLinea,yyline,yycolumn,yytext());
            }
            // fall through
          case 51: break;
          case 3:
            { 
            }
            // fall through
          case 52: break;
          case 4:
            { cadena+="\"";yybegin(STRING);
            }
            // fall through
          case 53: break;
          case 5:
            { return new Symbol(sym.CONCATSTRING,yyline,yycolumn,yytext());
            }
            // fall through
          case 54: break;
          case 6:
            { yybegin(COMENTARIO);
            }
            // fall through
          case 55: break;
          case 7:
            { return new Symbol(sym.PARENTESISL,yyline,yycolumn,yytext());
            }
            // fall through
          case 56: break;
          case 8:
            { return new Symbol(sym.PARENTESISR,yyline,yycolumn,yytext());
            }
            // fall through
          case 57: break;
          case 9:
            { return new Symbol(sym.OPMULTI,yyline,yycolumn,yytext());
            }
            // fall through
          case 58: break;
          case 10:
            { return new Symbol(sym.OPADICION,yyline,yycolumn,yytext());
            }
            // fall through
          case 59: break;
          case 11:
            { return new Symbol(sym.COMA,yyline,yycolumn,yytext());
            }
            // fall through
          case 60: break;
          case 12:
            { return new Symbol(sym.PUNTO,yyline,yycolumn,yytext());
            }
            // fall through
          case 61: break;
          case 13:
            { return new Symbol(sym.INTEGER,yyline,yycolumn,yytext());
            }
            // fall through
          case 62: break;
          case 14:
            { return new Symbol(sym.OPREL,yyline,yycolumn,yytext());
            }
            // fall through
          case 63: break;
          case 15:
            { return new Symbol(sym.IGUAL,yyline,yycolumn);
            }
            // fall through
          case 64: break;
          case 16:
            { return new Symbol(sym.identificador,yyline,yycolumn,yytext());
            }
            // fall through
          case 65: break;
          case 17:
            { cadena+=yytext();
            }
            // fall through
          case 66: break;
          case 18:
            { String temp = cadena + "\""; cadena="";yybegin(YYINITIAL);return new Symbol(sym.STRING,yyline,yycolumn,temp);
            }
            // fall through
          case 67: break;
          case 19:
            { yybegin(YYINITIAL);
            }
            // fall through
          case 68: break;
          case 20:
            { return new Symbol(sym.AS,yyline,yycolumn,yytext());
            }
            // fall through
          case 69: break;
          case 21:
            { return new Symbol(sym.DO,yyline,yycolumn,yytext());
            }
            // fall through
          case 70: break;
          case 22:
            { return new Symbol(sym.IF,yyline,yycolumn,yytext());
            }
            // fall through
          case 71: break;
          case 23:
            { return new Symbol(sym.OR,yyline,yycolumn,yytext());
            }
            // fall through
          case 72: break;
          case 24:
            { return new Symbol(sym.TO,yyline,yycolumn,yytext());
            }
            // fall through
          case 73: break;
          case 25:
            { return new Symbol(sym.AND,yyline,yycolumn,yytext());
            }
            // fall through
          case 74: break;
          case 26:
            { return new Symbol(sym.DIM,yyline,yycolumn);
            }
            // fall through
          case 75: break;
          case 27:
            { return new Symbol(sym.END,yyline,yycolumn,yytext());
            }
            // fall through
          case 76: break;
          case 28:
            { return new Symbol(sym.FOR,yyline,yycolumn,yytext());
            }
            // fall through
          case 77: break;
          case 29:
            { return new Symbol(sym.NEW,yyline,yycolumn,yytext());
            }
            // fall through
          case 78: break;
          case 30:
            { return new Symbol(sym.NOT,yyline,yycolumn,yytext());
            }
            // fall through
          case 79: break;
          case 31:
            { return new Symbol(sym.SUB,yyline,yycolumn,yytext());
            }
            // fall through
          case 80: break;
          case 32:
            { return new Symbol(sym.ELSE,yyline,yycolumn,yytext());
            }
            // fall through
          case 81: break;
          case 33:
            { return new Symbol(sym.EXIT,yyline,yycolumn,yytext());
            }
            // fall through
          case 82: break;
          case 34:
            { return new Symbol(sym.LOOP,yyline,yycolumn,yytext());
            }
            // fall through
          case 83: break;
          case 35:
            { return new Symbol(sym.NEXT,yyline,yycolumn,yytext());
            }
            // fall through
          case 84: break;
          case 36:
            { return new Symbol(sym.THEN,yyline,yycolumn,yytext());
            }
            // fall through
          case 85: break;
          case 37:
            { return new Symbol(sym.TRUE,yyline,yycolumn);
            }
            // fall through
          case 86: break;
          case 38:
            { return new Symbol(sym.FALSE,yyline,yycolumn);
            }
            // fall through
          case 87: break;
          case 39:
            { return new Symbol(sym.WHILE,yyline,yycolumn,yytext());
            }
            // fall through
          case 88: break;
          case 40:
            { return new Symbol(sym.ELSEIF,yyline,yycolumn,yytext());
            }
            // fall through
          case 89: break;
          case 41:
            { return new Symbol(sym.MODULE,yyline,yycolumn,yytext());
            }
            // fall through
          case 90: break;
          case 42:
            { return new Symbol(sym.RETURN,yyline,yycolumn,yytext());
            }
            // fall through
          case 91: break;
          case 43:
            { return new Symbol(sym.STRINGTYPE,yyline,yycolumn);
            }
            // fall through
          case 92: break;
          case 44:
            { return new Symbol(sym.BOOLEANTYPE,yyline,yycolumn);
            }
            // fall through
          case 93: break;
          case 45:
            { return new Symbol(sym.INTEGERTYPE,yyline,yycolumn);
            }
            // fall through
          case 94: break;
          case 46:
            { return new Symbol(sym.FUNCTION,yyline,yycolumn,yytext());
            }
            // fall through
          case 95: break;
          case 47:
            { return new Symbol(sym.STRUCTURE,yyline,yycolumn,yytext());
            }
            // fall through
          case 96: break;
          case 48:
            { return new Symbol(sym.WRITE,yyline,yycolumn);
            }
            // fall through
          case 97: break;
          case 49:
            { return new Symbol(sym.READ,yyline,yycolumn,yytext());
            }
            // fall through
          case 98: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
