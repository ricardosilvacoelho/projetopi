package model;

import java.io.Serializable;

public class Clima implements Serializable{
	private int id;
	private String data;
	private String hora;
	private double temp_inst;
	private double umid_inst;
	private double vento_vel;
	private double radiacao;
	
	public Clima() {
		
	}
	
	public Clima(int id, String data, String hora, double temp_inst, double umid_inst, double vento_vel,
			double radiacao) {
		this.id = id;
		this.data = data;
		this.hora = hora;
		this.temp_inst = temp_inst;
		this.umid_inst = umid_inst;
		this.vento_vel = vento_vel;
		this.radiacao = radiacao;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public String getHora() {
		return hora;
	}


	public void setHora(String hora) {
		this.hora = hora;
	}


	public double getTemp_inst() {
		return temp_inst;
	}


	public void setTemp_inst(double temp_inst) {
		this.temp_inst = temp_inst;
	}


	public double getUmid_inst() {
		return umid_inst;
	}


	public void setUmid_inst(double umid_inst) {
		this.umid_inst = umid_inst;
	}


	public double getVento_vel() {
		return vento_vel;
	}


	public void setVento_vel(double vento_vel) {
		this.vento_vel = vento_vel;
	}


	public double getRadiacao() {
		return radiacao;
	}


	public void setRadiacao(double radiacao) {
		this.radiacao = radiacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((hora == null) ? 0 : hora.hashCode());
		result = prime * result + id;
		long temp;
		temp = Double.doubleToLongBits(radiacao);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(temp_inst);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(umid_inst);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(vento_vel);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clima other = (Clima) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (hora == null) {
			if (other.hora != null)
				return false;
		} else if (!hora.equals(other.hora))
			return false;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(radiacao) != Double.doubleToLongBits(other.radiacao))
			return false;
		if (Double.doubleToLongBits(temp_inst) != Double.doubleToLongBits(other.temp_inst))
			return false;
		if (Double.doubleToLongBits(umid_inst) != Double.doubleToLongBits(other.umid_inst))
			return false;
		if (Double.doubleToLongBits(vento_vel) != Double.doubleToLongBits(other.vento_vel))
			return false;
		return true;
	}
	
	
}
