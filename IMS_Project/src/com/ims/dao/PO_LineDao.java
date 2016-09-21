package com.ims.dao;

import java.util.List;

import com.ims.entities.PO_Line;

public interface PO_LineDao {

	public PO_Line getPOLineById(int id);
	public List<PO_Line> getPOLineByOrder(int po);
	public List<PO_Line> getPOLineByQuantity(int q);
	public List<PO_Line> getPOLineByCost(int cost);
	public List<PO_Line> getAllPOLines();
	public boolean removePOLineById(int id);
	public boolean addNewPOLine(PO_Line po);
	public boolean removePOLineByCost(int cost);
	public boolean updatePOLineQuantity(PO_Line po);
}
