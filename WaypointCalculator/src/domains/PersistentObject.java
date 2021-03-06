package domains;

import java.sql.SQLException;

import javax.xml.bind.annotation.XmlTransient;

public abstract class PersistentObject implements Cloneable {
	@XmlTransient
	public int id;

	public abstract void save() throws RuntimeException;

	public abstract void persist() throws SQLException;

	public abstract void delete() throws SQLException;

	public abstract void dispose();

	public abstract String validate() throws SQLException;
	
	public abstract void loadAll() throws SQLException;

	@Override
	public PersistentObject clone() {
		
		try {			
			return (PersistentObject) super.clone();			
		} catch (CloneNotSupportedException ex) {			
			throw new InternalError();			
		}
	}
}
