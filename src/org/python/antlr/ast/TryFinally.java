// Autogenerated AST node
package org.python.antlr.ast;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.python.antlr.PythonTree;
import org.python.antlr.adapter.AstAdapters;
import org.python.core.AstList;
import org.python.core.Py;
import org.python.core.PyObject;
import org.python.core.PyString;
import org.python.core.PyType;
import org.python.expose.ExposedGet;
import org.python.expose.ExposedMethod;
import org.python.expose.ExposedNew;
import org.python.expose.ExposedSet;
import org.python.expose.ExposedType;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;

@ExposedType(name = "_ast.TryFinally", base = PyObject.class)
public class TryFinally extends stmtType {
public static final PyType TYPE = PyType.fromClass(TryFinally.class);
    private java.util.List<stmtType> body;
    public java.util.List<stmtType> getInternalBody() {
        return body;
    }
    @ExposedGet(name = "body")
    public PyObject getBody() {
        return new AstList(body, AstAdapters.stmtAdapter);
    }
    @ExposedSet(name = "body")
    public void setBody(PyObject body) {
        //FJW this.body = AstAdapters.to_stmtList(body);
    }

    private java.util.List<stmtType> finalbody;
    public java.util.List<stmtType> getInternalFinalbody() {
        return finalbody;
    }
    @ExposedGet(name = "finalbody")
    public PyObject getFinalbody() {
        return new AstList(finalbody, AstAdapters.stmtAdapter);
    }
    @ExposedSet(name = "finalbody")
    public void setFinalbody(PyObject finalbody) {
        //FJW this.finalbody = AstAdapters.to_stmtList(finalbody);
    }


    private final static String[] fields = new String[] {"body", "finalbody"};
    public String[] get_fields() { return fields; }

    public TryFinally() {
        this(TYPE);
    }
    public TryFinally(PyType subType) {
        super(subType);
    }
    @ExposedNew
    @ExposedMethod
    public void Module___init__(PyObject[] args, String[] keywords) {}
    public TryFinally(PyObject body, PyObject finalbody) {
        setBody(body);
        setFinalbody(finalbody);
    }

    public TryFinally(Token token, java.util.List<stmtType> body,
    java.util.List<stmtType> finalbody) {
        super(token);
        this.body = body;
        if (body == null) {
            this.body = new ArrayList<stmtType>();
        }
        for(PythonTree t : this.body) {
            addChild(t);
        }
        this.finalbody = finalbody;
        if (finalbody == null) {
            this.finalbody = new ArrayList<stmtType>();
        }
        for(PythonTree t : this.finalbody) {
            addChild(t);
        }
    }

    public TryFinally(Integer ttype, Token token, java.util.List<stmtType>
    body, java.util.List<stmtType> finalbody) {
        super(ttype, token);
        this.body = body;
        if (body == null) {
            this.body = new ArrayList<stmtType>();
        }
        for(PythonTree t : this.body) {
            addChild(t);
        }
        this.finalbody = finalbody;
        if (finalbody == null) {
            this.finalbody = new ArrayList<stmtType>();
        }
        for(PythonTree t : this.finalbody) {
            addChild(t);
        }
    }

    public TryFinally(PythonTree tree, java.util.List<stmtType> body,
    java.util.List<stmtType> finalbody) {
        super(tree);
        this.body = body;
        if (body == null) {
            this.body = new ArrayList<stmtType>();
        }
        for(PythonTree t : this.body) {
            addChild(t);
        }
        this.finalbody = finalbody;
        if (finalbody == null) {
            this.finalbody = new ArrayList<stmtType>();
        }
        for(PythonTree t : this.finalbody) {
            addChild(t);
        }
    }

    public String toString() {
        return "TryFinally";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("TryFinally(");
        sb.append("body=");
        sb.append(dumpThis(body));
        sb.append(",");
        sb.append("finalbody=");
        sb.append(dumpThis(finalbody));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitTryFinally(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (body != null) {
            for (PythonTree t : body) {
                if (t != null)
                    t.accept(visitor);
            }
        }
        if (finalbody != null) {
            for (PythonTree t : finalbody) {
                if (t != null)
                    t.accept(visitor);
            }
        }
    }

    private int lineno = -1;
    public int getLineno() {
        if (lineno != -1) {
            return lineno;
        }
        return getLine();
    }

    public void setLineno(int num) {
        lineno = num;
    }

    private int col_offset = -1;
    public int getCol_offset() {
        if (col_offset != -1) {
            return col_offset;
        }
        return getCharPositionInLine();
    }

    public void setCol_offset(int num) {
        col_offset = num;
    }

}
