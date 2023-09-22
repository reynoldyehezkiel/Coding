package com.mahasiswa.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.mahasiswa.model.*;

public class MahasiswaDAOImplementation implements MahasiswaDAO {

	private JdbcTemplate jdbcTemplate;
	
	public MahasiswaDAOImplementation(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int save(Mahasiswa mhs) {
		String sql = "INSERT INTO Mahasiswa (nim, nama, jurusan, tahun) VALUES (?,?,?,?)";
		
		return jdbcTemplate.update(sql, mhs.getNim(), mhs.getNama(), mhs.getJurusan(), mhs.getTahun());
	}

	@Override
	public Mahasiswa get(final String nim) {
		String sql = "SELECT * FROM Mahasiswa WHERE nim=" + nim;
		
		ResultSetExtractor<Mahasiswa> extractor = new ResultSetExtractor<Mahasiswa>() {
			
			@Override
			public Mahasiswa extractData(ResultSet rs) throws SQLException, DataAccessException {
				if (rs.next()) {
					String nama = rs.getString("nama");
					String jurusan = rs.getString("jurusan");
					String tahun = rs.getString("tahun");
					
					return new Mahasiswa(nim, nama, jurusan, tahun);
				}
				return null;
			}
		};
		
		return jdbcTemplate.query(sql, extractor);
	}

	@Override
	public List<Mahasiswa> list() {
		String sql = "SELECT * FROM Mahasiswa";
		
		RowMapper<Mahasiswa> rowMapper = new RowMapper<Mahasiswa>() {
			
			@Override
			public Mahasiswa mapRow(ResultSet rs, int rowNum) throws SQLException {
				String nim = rs.getString("nim");
				String nama = rs.getString("nama");
				String jurusan = rs.getString("jurusan");
				String tahun = rs.getString("tahun");
				
				return new Mahasiswa(nim, nama, jurusan, tahun);
			}
		};
		
		return jdbcTemplate.query(sql, rowMapper);
	}

}
