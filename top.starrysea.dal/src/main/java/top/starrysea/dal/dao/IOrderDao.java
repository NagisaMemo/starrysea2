package top.starrysea.dal.dao;

import top.starrysea.dal.common.Condition;
import top.starrysea.dal.common.DaoResult;
import top.starrysea.dal.entity.Orders;

public interface IOrderDao {

	DaoResult getAllOrderDao(Condition condition, Orders order);

	DaoResult getOrderCountDao(Condition condition, Orders order);

	DaoResult getOrderDao(Orders order);

	DaoResult saveOrderDao(Orders order);

	DaoResult updateOrderDao(Orders order);

	DaoResult deleteOrderDao(Orders order);
}
