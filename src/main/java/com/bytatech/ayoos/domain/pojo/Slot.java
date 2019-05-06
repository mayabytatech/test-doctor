 /*
 * Copyright 2002-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bytatech.ayoos.domain.pojo;

import java.time.LocalDate;

/**
 * TODO Provide a detailed description here 
 * @author MayaSanjeev
 * mayabytatech, maya.k.k@lxisoft.com
 */
public class Slot {

	private long id;
	private LocalDate date;
	private Double starTime ;
	private Double toTime;
	private boolean bookedOrNot ;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Double getStarTime() {
		return starTime;
	}
	public void setStarTime(Double starTime) {
		this.starTime = starTime;
	}
	public Double getToTime() {
		return toTime;
	}
	public void setToTime(Double toTime) {
		this.toTime = toTime;
	}
	@Override
	public String toString() {
		return "Slot [id=" + id + ", date=" + date + ", starTime=" + starTime + ", toTime=" + toTime + ", bookedOrNot="
				+ bookedOrNot + "]";
	}
	public boolean isBookedOrNot() {
		return bookedOrNot;
	}
	public void setBookedOrNot(boolean bookedOrNot) {
		this.bookedOrNot = bookedOrNot;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (bookedOrNot ? 1231 : 1237);
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((starTime == null) ? 0 : starTime.hashCode());
		result = prime * result + ((toTime == null) ? 0 : toTime.hashCode());
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
		Slot other = (Slot) obj;
		if (bookedOrNot != other.bookedOrNot)
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (id != other.id)
			return false;
		if (starTime == null) {
			if (other.starTime != null)
				return false;
		} else if (!starTime.equals(other.starTime))
			return false;
		if (toTime == null) {
			if (other.toTime != null)
				return false;
		} else if (!toTime.equals(other.toTime))
			return false;
		return true;
	}
	
	
	
	
	
}
