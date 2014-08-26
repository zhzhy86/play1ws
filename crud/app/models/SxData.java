package models;

import javax.persistence.*;

import java.sql.*;
import java.sql.Blob;

import javax.sql.*;

import org.hibernate.annotations.GenericGenerator;

import java.math.*;
import java.util.*;
import java.util.Date;

import play.db.jpa.*;

@Entity
@Table(name="sx_data" , catalog = "test")
public class SxData extends GenericModel{

	@Id
	@Column(name="id")
	@GeneratedValue(generator = "db-gen")
    @GenericGenerator(name = "db-gen", strategy = "identity")
	public Integer id;

	@Column(name="name", nullable=false, length=100)
	public String name;

	@Column(name="val")
	public BigDecimal val;

	@Column(name="create_time", nullable=false)
	public Timestamp createTime;

	@Column(name="status", nullable=false)
	public Integer status;

}