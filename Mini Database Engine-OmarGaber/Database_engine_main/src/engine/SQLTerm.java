package engine;


/** * @author Wael Abouelsaadat */ 

public class SQLTerm {

	public String _strTableName,_strColumnName, _strOperator;
	public Object _objValue;

	    public SQLTerm(String _strTableName, String _strColumnName, String _strOperator, Object _objValue) {
	        this._strTableName = _strTableName;
	        this._strColumnName = _strColumnName;
	        this._strOperator = _strOperator;
	        this._objValue = _objValue;
	    }
	    public String get_strTableName() {
	        return _strTableName;
	    }

	    public void set_strTableName(String _strTableName) {
	        this._strTableName = _strTableName;
	    }

	    public String get_strColumnName() {
	        return _strColumnName;
	    }

	    public void set_strColumnName(String _strColumnName) {
	        this._strColumnName = _strColumnName;
	    }

	    public String get_strOperator() {
	        return _strOperator;
	    }

	    public void set_strOperator(String _strOperator) {
	        this._strOperator = _strOperator;
	    }

	    public Object get_objValue() {
	        return _objValue;
	    }

	    public void set_objValue(Object _objValue) {
	        this._objValue = _objValue;
	    }
	    
//ensures that _strOperator is a valid comparison operator and throws an exception if it is not
	    public void checkArithmaticOperator() throws DBAppException {
	        if(!_strOperator.equals(">") && !_strOperator.equals(">=") && !_strOperator.equals("<") && !_strOperator.equals("<=")
	                && !_strOperator.equals("=") && !_strOperator.equals("!="))
	            throw new DBAppException("Invalid engine.SQLTerm operator");
	    }



}